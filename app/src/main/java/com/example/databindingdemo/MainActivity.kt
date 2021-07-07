package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingdemo.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil as DataBindingUtil1

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("Ali","13213213121","asdsa@asdas.com","sadasdasd")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil1.setContentView(this,R.layout.activity_main)
        binding.personData = aPerson

        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "xxx@gmail.com"
            binding.apply{ invalidateAll() }

        }

//        binding.tvName.text = aPerson.name
//        binding.tvIC.text = aPerson.ic
//        binding.tvEmail.text = aPerson.email
//        binding.tvAddress.text = aPerson.address


    }
}