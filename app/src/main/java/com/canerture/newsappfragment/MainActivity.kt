package com.canerture.newsappfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.canerture.newsappfragment.databinding.ActivityMainBinding
import com.canerture.newsappfragment.utils.FragmentUtils

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        FragmentUtils.drawFragments(supportFragmentManager)

    }
}