package uz.orifjon.newsappdagger2.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.orifjon.newsappdagger2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}