package mx.edu.potros.adopaws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Encontrar_Mascota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encontrar_mascota)

        val buttonPerdidos: Button = findViewById(R.id.btn_perdidos)
        val emergenteGato: ImageView = findViewById(R.id.iv_mascotaGato)

        buttonPerdidos.setOnClickListener(){
            var intent: Intent = Intent(this,Encontrar_Mascota::class.java)
            startActivity(intent)
        }

        emergenteGato.setOnClickListener(){
            var intent: Intent = Intent(this,Emergente_Gato::class.java)
            startActivity(intent)
        }

        val btnHome: ImageButton = findViewById(R.id.btn_home)
        val btnMapa: ImageButton = findViewById(R.id.btn_map)
        val btnAvisos: ImageButton = findViewById(R.id.btn_warnings)
        val btnMensajes: ImageButton = findViewById(R.id.btn_messages)
        val btnProfile: ImageButton = findViewById(R.id.btn_profile)

        btnHome.setOnClickListener {
            val intent: Intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

//        btnMensajes.setOnClickListener {
//            val intent: Intent = Intent(this, Mensajes::class.java)
//            startActivity(intent)
//        }

        btnAvisos.setOnClickListener {
            val intent: Intent = Intent(this, Encontrar_Mascota::class.java)
            startActivity(intent)
        }

        btnProfile.setOnClickListener {
            var intent: Intent = Intent(this, perfilUsuario::class.java)
            intent.putExtra("tipoMascota","Interes")
            startActivity(intent)
        }
    }
}