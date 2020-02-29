package com.shaunhossain.learnmylanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import com.shaunhossain.learnmylanguage.databinding.ActivityMainBinding

class NumbersActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_numbers)

        var numbers = ArrayList<String>()
        numbers.add("One")
        numbers.add("Two")
        numbers.add("Three")
        numbers.add("Four")
        numbers.add("Five")
        numbers.add("Six")
        numbers.add("Seven")
        numbers.add("Eight")
        numbers.add("Nine")
        numbers.add("Ten")
        // numbers.removeAt(0)

        val numberAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,numbers)
        //listView.adapter = arrayAdapter

        val listView: ListView = findViewById(R.id.show_number_list)
        listView.setAdapter(numberAdapter)
    }
}
