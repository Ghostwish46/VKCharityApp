package dev.ghost.vkcharityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CreateTargetDonationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_target_donation)
        title = getString(R.string.title_target_donation)
    }
}