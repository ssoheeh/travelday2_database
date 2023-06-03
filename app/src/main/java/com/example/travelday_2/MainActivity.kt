package com.example.travelday_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.travelday_2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var tabLayout:TabLayout
    lateinit var viewPager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTabLayout()
    }

    private fun setTabLayout() {
        val tabCount=3
        val viewPagerAdapter=ViewPagerAdapter(supportFragmentManager, lifecycle, tabCount)
        binding.viewPager2.adapter = viewPagerAdapter
        TabLayoutMediator(binding.tabLayout,binding.viewPager2){tab, position->
            when(position){
                0->tab.text="준비물"
                1->tab.text="일정"
                2->tab.text="여행기"

        }
    }.attach()
}}