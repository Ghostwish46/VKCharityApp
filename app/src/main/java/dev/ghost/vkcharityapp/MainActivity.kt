package dev.ghost.vkcharityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createDonation(view: View) {
        val intentCreation = Intent(this, DonationTypeActivity::class.java)
        startActivity(intentCreation)
    }
}