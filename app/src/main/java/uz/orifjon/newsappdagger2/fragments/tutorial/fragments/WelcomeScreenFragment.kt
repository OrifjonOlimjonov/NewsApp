package uz.orifjon.newsappdagger2.fragments.tutorial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import uz.orifjon.newsappdagger2.R
import uz.orifjon.newsappdagger2.databinding.FragmentWelcomeScreenBinding
import uz.orifjon.newsappdagger2.utils.viewBindings


class WelcomeScreenFragment : Fragment(R.layout.fragment_welcome_screen) {

    private val binding by viewBindings(FragmentWelcomeScreenBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}