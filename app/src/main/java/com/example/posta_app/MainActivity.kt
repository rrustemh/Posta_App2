package com.example.posta_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.posta_app.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private var navController: NavController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNavigationComponent()
        val bottomNavBar = findViewById<BottomNavigationView>(R.id.user_bottom_navigation)
        bottomNavBar.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_dashboard -> navController?.navigate(R.id.dashboardFragment)
                R.id.ic_add -> navController?.navigate(R.id.deliveryFragment)
                R.id.ic_profile -> navController?.navigate(R.id.profileFragment)
            }
            true
        }
    }
    private fun setupNavigationComponent() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }
}