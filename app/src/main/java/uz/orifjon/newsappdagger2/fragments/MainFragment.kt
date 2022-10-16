package uz.orifjon.newsappdagger2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.Module
import uz.orifjon.newsappdagger2.R
import uz.orifjon.newsappdagger2.databinding.FragmentMainBinding
import uz.orifjon.newsappdagger2.utils.viewBindings

class MainFragment : Fragment() {

    private val binding by viewBindings(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }


}