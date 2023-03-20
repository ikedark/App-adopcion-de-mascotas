package mx.edu.potros.adopaws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_pregunta: Button = findViewById(R.id.btn_registrate)
        var btn_iniciarSesion: Button = findViewById(R.id.btn_login) as Button

        btn_iniciarSesion.setOnClickListener {
            var intent: Intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        btn_pregunta.setOnClickListener {
            val intent: Intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

    }
}