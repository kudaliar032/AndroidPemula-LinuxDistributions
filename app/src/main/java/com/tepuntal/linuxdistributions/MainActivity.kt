package com.tepuntal.linuxdistributions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MainActivity : AppCompatActivity() {
    private lateinit var rvDistros: RecyclerView
    private var list: ArrayList<Distro> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDistros = findViewById(R.id.rv_distro)
        rvDistros.setHasFixedSize(true)

        list.addAll(DistrosData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvDistros.layoutManager = LinearLayoutManager(this)
        val listDistroAdapter = DistroListAdapter(list)
        rvDistros.adapter = listDistroAdapter

        listDistroAdapter.setOnItemClickCallback(object: DistroListAdapter.OnItemClickCallback {
            override fun onItemClicked(distro: Distro) {
                showSelectedDistro(distro)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_me -> {
                val moveIntent = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(moveIntent)
            }
        }
        return true
    }

    private fun showSelectedDistro(distro: Distro) {
        val distroDetailIntent = Intent(this@MainActivity, DistroDetail::class.java)
        distroDetailIntent.putExtra(DistroDetail.DISTRO_NAME, distro.name)
        distroDetailIntent.putExtra(DistroDetail.DISTRO_VERSION, distro.version)
        distroDetailIntent.putExtra(DistroDetail.DISTRO_LOGO, distro.logo)
        distroDetailIntent.putExtra(DistroDetail.DISTRO_DESCIPTION, distro.description)
        startActivity(distroDetailIntent)
    }
}
