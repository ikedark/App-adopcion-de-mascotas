package mx.edu.potros.adopaws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog

class buscarMascota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buscar_mascota)

        val btnAyuda: ImageButton = findViewById(R.id.btn_ayuda)

        btnAyuda.setOnClickListener {
            val builder = AlertDialog.Builder(this@buscarMascota)

            val view = layoutInflater.inflate(R.layout.dialog_reporte, null)

            builder.setView(view)

            val dialog = builder.create()

            dialog.show()

            val btnEncontre : Button? = dialog.findViewById(R.id.btnEncontre)

            val btnPerdi: Button? = dialog.findViewById(R.id.btnPerdi)

            if (btnPerdi != null) {
                btnPerdi.setOnClickListener {
                    val intent: Intent = Intent(this, generarReporte::class.java)
                    startActivity(intent)
                    dialog.dismiss()
                }
            }

            if (btnEncontre != null) {
                btnEncontre.setOnClickListener {
//                    finish()
                    val intent: Intent = Intent(this, generarReporte::class.java)
                    startActivity(intent)
                    dialog.dismiss()
                }
            }
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

        btnMapa.setOnClickListener {
            val intent: Intent = Intent( this, MapaPrueba::class.java)
            startActivity(intent)
        }

//        btnMensajes.setOnClickListener {
//            val intent: Intent = Intent(this, Mensajes::class.java)
//            startActivity(intent)
//        }

        btnAvisos.setOnClickListener {
            val intent: Intent = Intent(this, buscarMascota::class.java)
            startActivity(intent)
        }

        btnProfile.setOnClickListener {
            var intent: Intent = Intent(this, perfilUsuario::class.java)
            intent.putExtra("tipoMascota","Interes")
            startActivity(intent)
        }
    }
}