package dev.ghost.vkcharityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DonationTypeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donation_type)
        title = getString(R.string.title_donation_type)
    }

    fun createTargetDonation(view: View) {
        val intent = Intent(this, CreateTargetDonationActivity::class.java)
        startActivity(intent)
    }
    fun createRegularDonation(view: View) {}
}