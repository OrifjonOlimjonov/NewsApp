package uz.orifjon.newsappdagger2

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import uz.orifjon.newsappdagger2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("tutorial", MODE_PRIVATE)
        editor = sharedPreferences.edit()


        val check = sharedPreferences.getBoolean("check", false)
        editor.putBoolean("check",true).commit()
       // Toast.makeText(this, check.toString(), Toast.LENGTH_SHORT).show()
        if (check) {
            findNavController(R.id.fragmentContainerView).popBackStack()
            findNavController(R.id.fragmentContainerView).navigate(R.id.mainFragment)
        } else {
            findNavController(R.id.fragmentContainerView).popBackStack()
            findNavController(R.id.fragmentContainerView).navigate(R.id.onBoardingFragment)
            // findNavController(R.id.fragmentContainerView).navigate()
        }


    }
}