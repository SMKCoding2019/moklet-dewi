package com.dycode.edu.moca

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar);
        val actionBar = supportActionBar;
        actionBar!!.setDisplayShowHomeEnabled(true);
        actionBar.setBackgroundDrawable(ColorDrawable(Color.parseColor("#14000000")));
        val navigationView:BottomNavigationView = findViewById(R.id.navigation)
        replacefragment(Dashboard.getInstance());
        actionBar!!.title="Mocha Media"
        navigationView.setOnNavigationItemSelectedListener {
            item ->
            when(item.itemId){
                R.id.dashboard ->{
                    actionBar.title = "Mocha Media"
                    val dashboardfrag = Dashboard.getInstance();
                    replacefragment(dashboardfrag);
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.search -> {
                    actionBar.title = ""
                    val searchfrag = Search.getInstance();
                    replacefragment(searchfrag);
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.profile -> {
                    actionBar.title = "ddewik"
                    val profilefrag = Profile.getInstance();
                    replacefragment(profilefrag);
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.settings -> {
                    actionBar.title = "Settings"
                    val settingsfrag = Settings.getInstance();
                    replacefragment(settingsfrag);
                    return@setOnNavigationItemSelectedListener true
                }

            }
            false
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.notification -> {
                Toast.makeText(this, "Notification Clicked", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun replacefragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit()
    }
}
