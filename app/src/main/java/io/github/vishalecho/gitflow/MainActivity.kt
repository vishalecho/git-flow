package io.github.vishalecho.gitflow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.vishalecho.gitflow.feature.home.HomeFragment


class MainActivity : AppCompatActivity() {

    val homeFragment = HomeFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, homeFragment)
            .commitAllowingStateLoss()
    }
}