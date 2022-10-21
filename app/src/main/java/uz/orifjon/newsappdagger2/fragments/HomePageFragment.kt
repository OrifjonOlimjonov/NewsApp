package uz.orifjon.newsappdagger2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import uz.orifjon.newsappdagger2.R
import uz.orifjon.newsappdagger2.databinding.FragmentHomePageBinding
import uz.orifjon.newsappdagger2.utils.viewBindings

class HomePageFragment : Fragment(R.layout.fragment_home_page) {

    private val binding by viewBindings(FragmentHomePageBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }


}