package mx.edu.potros.adopaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val sp_dias: Spinner = findViewById(R.id.sp_dia)
        val sp_mes: Spinner = findViewById(R.id.sp_mes)
        val sp_anio: Spinner = findViewById(R.id.sp_año)




    }
}