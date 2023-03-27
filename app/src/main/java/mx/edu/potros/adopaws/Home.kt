package mx.edu.potros.adopaws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnProfile: ImageButton = findViewById(R.id.btn_profile)

        btnProfile.setOnClickListener {
            val intent: Intent = Intent(this, perfilUsuario::class.java)
            startActivity(intent)
        }
    }
}