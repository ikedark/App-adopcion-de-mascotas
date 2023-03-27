package mx.edu.potros.adopaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class perfilUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_usuario)

        var tv_nombre: TextView = findViewById(R.id.tv_nombre_usuario)

        val bundle = intent.extras

        if (bundle != null){
            val name = bundle.getString("name")
            tv_nombre.setText(name)
        }

    }
}