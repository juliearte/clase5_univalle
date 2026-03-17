package com.example.clase5

import ViewPagerAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.clase5.databinding.ActivityMain2Binding
import com.google.android.material.tabs.TabLayoutMediator
class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        setupToolbar()
        setupTabs()
        setupButtonNavigation()
    }

    private fun setupToolbar(){
        binding.contentToolbar.toolbar.title = "Activity Dos"
        binding.contentToolbar.toolbar.setNavigationOnClickListener{ onBackPressed() }
        binding.contentToolbar.toolbar.setOnMenuItemClickListener { item ->
            when(item.itemId){
                R.id.menu1 -> {
                    //Tarea a realizar
                    true
                }
                R.id.menu2 ->{
                    //Tarea a realizar
                    true
                }
                else -> false
            }
        }
    }

    private fun setupTabs() {
        val viewPager = binding.viewPager
        viewPager.adapter = ViewPagerAdapter(this)

        val tabLayout = binding.tabLayout
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Chats"
                1 -> tab.text = "Novedades"
            }
        }.attach() //para mostrar las pestañas
    }

    private fun setupButtonNavigation() {
        binding.btnNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.btn1 ->
                    startActivity(Intent(this, MainActivity::class.java))

                R.id.btn2 ->
                    Toast.makeText(this, "Favorito", Toast.LENGTH_SHORT).show()

                R.id.btn3 ->
                    Toast.makeText(this, "Música", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}