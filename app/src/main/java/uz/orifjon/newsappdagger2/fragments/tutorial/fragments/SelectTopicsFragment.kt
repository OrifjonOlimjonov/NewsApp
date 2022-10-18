package uz.orifjon.newsappdagger2.fragments.tutorial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.orifjon.newsappdagger2.databinding.FragmentSelectTopicsBinding
import uz.orifjon.newsappdagger2.utils.viewBindings

class WelcomeFragment : Fragment() {


    private val binding by viewBindings(FragmentSelectTopicsBinding::bind)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {







        return binding.root
    }


}