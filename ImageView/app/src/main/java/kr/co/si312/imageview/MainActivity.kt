package kr.co.si312.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.si312.imageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView3.setImageResource(R.drawable.img)
    }
}