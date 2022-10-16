package uz.orifjon.newsappdagger2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.Module
import uz.orifjon.newsappdagger2.R
import uz.orifjon.newsappdagger2.databinding.FragmentMainBinding



class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater,container,false)



        return binding.root
    }


}