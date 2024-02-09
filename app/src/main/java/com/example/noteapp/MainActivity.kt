package com.example.noteapp

import android.os.Bundle
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.noteapp.databinding.MainActivityBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(
            this,
            R.layout.main_activity
        )

        setUpNavigationComponent()
    }

    private fun setUpNavigationComponent() {
        val navHostFragment: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        /*val popupMenu = PopupMenu(this,null)
        popupMenu.inflate(R.menu.menu_item)
        val menu=popupMenu.menu*/
        val navController =navHostFragment.navController
        binding.navigation.setupWithNavController(navController)
    }
}


