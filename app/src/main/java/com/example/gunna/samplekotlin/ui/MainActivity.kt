package com.example.gunna.samplekotlin.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.gunna.samplekotlin.viewmodel.MainViewModel
import com.example.gunna.samplekotlin.R
import com.example.gunna.samplekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.viewModel = MainViewModel()
    }


}