package br.com.fiap.habits

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val onLogin = findViewById<Button>(R.id.btn_login)

        onLogin.setOnClickListener { it: View
            val i = Intent(this, Home::class.java)
            startActivities(i)
        }

        Log.i(tag: "lifeCycle", msg: "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag: "lifeCycle", msg: "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag: "lifeCycle", msg: "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag: "lifeCycle", msg: "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag: "lifeCycle", msg: "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag: "lifeCycle", msg: "onRestart")
    }

    fun onCliqueAqui(view: View) {
        Toast.makeText(this, "Cadastro criado!", Toast.LENGTH_SHORT).show()
    }


}