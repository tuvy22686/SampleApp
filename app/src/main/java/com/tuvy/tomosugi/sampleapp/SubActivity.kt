package com.tuvy.tomosugi.sampleapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.tuvy.tomosugi.sampleapp.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    companion object {
        fun createIntent(context: Context):Intent {
            return Intent(context, SubActivity::class.java)
        }
    }

    private val binding: ActivitySubBinding by lazy {
        ActivitySubBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupToolbar()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        item?.let {
            when(it.itemId) {
                android.R.id.home -> finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setupToolbar() {
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setDisplayShowTitleEnabled(false)
        }
    }
}