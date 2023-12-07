package com.example.tugasyudhamodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_nav)

        val fragment = HomeFragment.newInstance("test1", "test2")
        bottom_navigation.setOnNavigationItemSelectedListener(menuItemSelected)
        addFragment(fragment)
    }

    private val menuItemSelected = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId){
            R.id.itemhome->{
                val fragment = HomeFragment.newInstance("test1", "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.itembookmark->{
                val fragment = BookmarkFragment.newInstance("test1", "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemprofile->{
                val fragment = ProfileFragment.newInstance("test1", "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(com.google.android.material.R.anim.design_bottom_sheet_slide_in, com.google.android.material.R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

}