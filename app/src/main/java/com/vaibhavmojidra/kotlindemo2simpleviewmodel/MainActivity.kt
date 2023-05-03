package com.vaibhavmojidra.kotlindemo2simpleviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vaibhavmojidra.kotlindemo2simpleviewmodel.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.resultTextview.text=viewModel.getNumber().toString()
        binding.submit.setOnClickListener {
            viewModel.setNumber(binding.numberEditText.text.toString().toInt())
            viewModel.setNumber(viewModel.getNumber()+4)
            binding.resultTextview.text=viewModel.getNumber().toString()
        }
    }
}