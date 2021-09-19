package ru.geekbrains.nasaapi.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import ru.geekbrains.nasaapi.R
import ru.geekbrains.nasaapi.view.fragments.NavigationFragment
import ru.geekbrains.nasaapi.viewmodel.OneBigFatViewModel

class MainActivity : AppCompatActivity() {
    val oneBigFatViewModel by lazy {
        ViewModelProvider(this).get(OneBigFatViewModel::class.java)
    }

    lateinit var navigation: Navigation
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation = Navigation(supportFragmentManager)
        navigation.showNavigationFragment(NavigationFragment.newInstance())
    }
}