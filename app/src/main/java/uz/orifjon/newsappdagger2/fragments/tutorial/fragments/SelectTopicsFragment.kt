package uz.orifjon.newsappdagger2.fragments.tutorial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.orifjon.newsappdagger2.R
import uz.orifjon.newsappdagger2.databinding.FragmentSelectTopicsBinding
import uz.orifjon.newsappdagger2.utils.viewBindings

class SelectTopicsFragment : Fragment(R.layout.fragment_select_topics) {


    private val binding by viewBindings(FragmentSelectTopicsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            btnAnimals.setOnClickListener {
                //TODO: Select animals
            }
            btnArt.setOnClickListener {
                //TODO: Select art
            }
            btnFashion.setOnClickListener {
                //TODO: Select fashion
            }
            btnFood.setOnClickListener {
                //TODO: Select Food
            }
            btnGaming.setOnClickListener {
                //TODO: Select Gaming
            }
            btnLife.setOnClickListener {
                //TODO: Select Life
            }
            btnSports.setOnClickListener {
                //TODO: Select Sports
            }
            btnHistory.setOnClickListener {
                //TODO: Select History
            }
            btnNature.setOnClickListener {
                //TODO: Select Nature
            }
        }
    }


}