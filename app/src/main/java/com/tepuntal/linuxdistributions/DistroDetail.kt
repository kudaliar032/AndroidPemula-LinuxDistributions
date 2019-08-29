package com.tepuntal.linuxdistributions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DistroDetail : AppCompatActivity() {
    companion object {
        const val DISTRO_NAME = "distro_name"
        const val DISTRO_VERSION = "distro_version"
        const val DISTRO_LOGO = "distro_logo"
        const val DISTRO_DESCIPTION = "distro_description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distro_detail)

        val name = intent.getStringExtra(DISTRO_NAME)
        val version = intent.getStringExtra(DISTRO_VERSION)
        val logo = intent.getStringExtra(DISTRO_LOGO)
        val description = intent.getStringExtra(DISTRO_DESCIPTION)

        var actionBar = supportActionBar
        actionBar!!.title = name
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tvName: TextView = findViewById(R.id.tv_detail_name)
        val tvVersion: TextView = findViewById(R.id.tv_detail_version)
        val imgLogo: ImageView = findViewById(R.id.img_detail_logo)
        val tvDescription: TextView = findViewById(R.id.tv_detail_description)

        Glide.with(this)
            .load(logo)
            .apply(RequestOptions().override(1024, 1024))
            .into(imgLogo)

        tvName.text = name
        tvVersion.text = version
        tvDescription.text = description
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
