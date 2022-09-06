package com.naulepilef.aprenda_ingles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.naulepilef.aprenda_ingles.fragment.AnimalFragment
import com.naulepilef.aprenda_ingles.fragment.NumberFragment
import com.naulepilef.aprenda_ingles.fragment.VowelFragment
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems

class MainActivity : AppCompatActivity() {
    private lateinit var smartTabLayout: SmartTabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.elevation = 0f

        val adapterTab = FragmentPagerItemAdapter(
            supportFragmentManager, FragmentPagerItems.with(this)
                .add(R.string.smartTab_animal, AnimalFragment::class.java)
                .add(R.string.smartTab_number, NumberFragment::class.java)
                .add(R.string.smartTab_vowel, VowelFragment::class.java)
                .create()
        )

        viewPager = findViewById(R.id.activity_main_viewPager)
        viewPager.adapter = adapterTab

        smartTabLayout = findViewById(R.id.activity_main_viewPagerTab)
        smartTabLayout.setViewPager(viewPager)
    }
}