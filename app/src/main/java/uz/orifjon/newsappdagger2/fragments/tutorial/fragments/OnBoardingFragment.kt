package uz.orifjon.newsappdagger2.fragments.tutorial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import uz.orifjon.newsappdagger2.R
import uz.orifjon.newsappdagger2.databinding.FragmentOnBoardingBinding

class OnBoardingFragment : Fragment() {
    private lateinit var binding:FragmentOnBoardingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentOnBoardingBinding.inflate(inflater,container,false)





        return binding.root
    }


}