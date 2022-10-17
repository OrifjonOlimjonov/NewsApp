package uz.orifjon.newsappdagger2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.orifjon.newsappdagger2.databinding.FragmentWelcomeScreenBinding
import uz.orifjon.newsappdagger2.utils.viewBindings


class WelcomeScreenFragment : Fragment(R.layout.fragment_welcome_screen) {

    private val binding by viewBindings(FragmentWelcomeScreenBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}