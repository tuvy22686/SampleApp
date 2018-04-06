package com.tuvy.tomosugi.sampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.tuvy.tomosugi.sampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("LifeCycle", "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Toast.makeText(this, "ボタンが押されました", Toast.LENGTH_SHORT)
                    .show()
        }
    }

    override fun onStart() {
        Log.d("LifeCycle", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("LifeCycle", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("LifeCycle", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("LifeCycle", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("LifeCycle", "onDestroy")
        super.onDestroy()
    }
}
