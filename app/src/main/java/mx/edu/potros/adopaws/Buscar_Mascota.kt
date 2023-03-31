package mx.edu.potros.adopaws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Buscar_Mascota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar_mascota)

        val buttonEncontrados: Button = findViewById(R.id.btn_encontrados)
        val emergenteEspanto: ImageView = findViewById(R.id.iv_mascotaEspanto)

        buttonEncontrados.setOnClickListener(){
            var intent: Intent = Intent(this,Encontrar_Mascota::class.java)
            startActivity(intent)
        }

        emergenteEspanto.setOnClickListener(){
            var intent: Intent = Intent(this,Emergente_Espanto::class.java)
            startActivity(intent)
        }


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

//        btnMensajes.setOnClickListener {
//            val intent: Intent = Intent(this, Mensajes::class.java)
//            startActivity(intent)
//        }

        btnAvisos.setOnClickListener {
            val intent: Intent = Intent(this, Buscar_Mascota::class.java)
            startActivity(intent)
        }

        btnProfile.setOnClickListener {
            var intent: Intent = Intent(this, perfilUsuario::class.java)
            intent.putExtra("tipoMascota","Interes")
            startActivity(intent)
        }

    }
}