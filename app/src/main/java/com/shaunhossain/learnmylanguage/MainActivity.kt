package com.shaunhossain.learnmylanguage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.shaunhossain.learnmylanguage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.numbers.setOnClickListener {
            openNumbersActivity()
        }
        binding.family.setOnClickListener {
            openFamilyActivity()
        }
        binding.color.setOnClickListener {
            openColorsActivity()
        }
        binding.phrases.setOnClickListener {
            openPhrasesActivity()
        }

    }
    fun openNumbersActivity(){
        val intent = Intent(this, NumbersActivity::class.java)
        startActivity(intent)

    }
    fun openFamilyActivity(){
        val intent = Intent(this,ColorsActivity::class.java)
        startActivity(intent)
    }
    fun openColorsActivity(){
        val intent = Intent(this,ColorsActivity::class.java)
        startActivity(intent)
    }
    fun openPhrasesActivity(){
        val intent = Intent(this,PhrasesActivity::class.java)
        startActivity(intent)
    }
}
