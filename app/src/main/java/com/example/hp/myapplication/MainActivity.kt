package com.example.hp.myapplication

import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var dBase: SQLiteDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        dBase = openOrCreateDatabase("snak_db",
                Context.MODE_PRIVATE,null)
        dBase.execSQL("create table if not exists snak(title primary key,size float,description varchar(1000))")
// insert into table_name values(value1,'value2','value3')

        ll1.setOnClickListener({
            var i= Intent(this@MainActivity,Eleventh::class.java )
            startActivity(i)
        })
        ll2.setOnClickListener({
            var i= Intent(this@MainActivity,Second::class.java )
            startActivity(i)
        })
        ll3.setOnClickListener({
            var i= Intent(this@MainActivity,ThirdActivity::class.java )
            startActivity(i)
        })
        ll4.setOnClickListener({
            var i= Intent(this@MainActivity,FourthActivity::class.java )
            startActivity(i)
        })
        ll5.setOnClickListener({
            var i= Intent(this@MainActivity,Fifth::class.java )
            startActivity(i)
        })
        ll6.setOnClickListener({
            var i= Intent(this@MainActivity,Sixth::class.java )
            startActivity(i)
        })
        ll7.setOnClickListener({
            var i= Intent(this@MainActivity,Seventh::class.java )
            startActivity(i)
        })
        ll8.setOnClickListener({
            var i= Intent(this@MainActivity,Eighth::class.java )
            startActivity(i)
        })
        ll9.setOnClickListener({
            var i= Intent(this@MainActivity,Tenth::class.java )
            startActivity(i)
        })
        ll10.setOnClickListener({
            var i= Intent(this@MainActivity,Tenth::class.java )
            startActivity(i)
        })
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {

            R.id.nav_gallery -> {

            }

            R.id.rate_us -> {

                }

            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true

    }

}



