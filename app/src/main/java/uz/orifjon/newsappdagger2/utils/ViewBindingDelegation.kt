package uz.orifjon.newsappdagger2.utils

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.*
import androidx.viewbinding.ViewBinding
import java.lang.IllegalStateException

class ViewBindingDelegation<T : ViewBinding>(
    private val fragment: Fragment,
    private val viewBindingFactory: (View) -> T,
) : Lazy<T> {

    private var binding: T? = null

    init {
        fragment.lifecycle.addObserver(object : DefaultLifecycleObserver {
            val viewLifeCycleLiveData = Observer<LifecycleOwner?> {
                it?.lifecycle?.addObserver(object : DefaultLifecycleObserver {
                    override fun onDestroy(owner: LifecycleOwner) {
                        binding = null
                    }
                })
            }

            override fun onCreate(owner: LifecycleOwner) {
                fragment.viewLifecycleOwnerLiveData.observeForever(viewLifeCycleLiveData)
            }

            override fun onDestroy(owner: LifecycleOwner) {
                fragment.viewLifecycleOwnerLiveData.removeObserver(viewLifeCycleLiveData)
            }
        })
    }

    override val value: T
        get() {
            binding?.let { return it }

            val currentState = fragment.lifecycle.currentState

            if (!currentState.isAtLeast(Lifecycle.State.INITIALIZED)) {
                throw IllegalStateException("You cannot call this reference from outside of onCreateView() and onDestroyView()")
            }
            return viewBindingFactory(fragment.requireView()).also { binding = it }
        }

    override fun isInitialized(): Boolean = binding != null

}

inline fun <reified T : ViewBinding> Fragment.viewBindings(noinline factory: (View) -> T) =
    ViewBindingDelegation(this, factory)