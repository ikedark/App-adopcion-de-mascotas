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

        btn_pregunta.setOnClickListener {
            val intent: Intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}