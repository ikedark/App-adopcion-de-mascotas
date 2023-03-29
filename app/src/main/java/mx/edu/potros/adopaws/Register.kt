package mx.edu.potros.adopaws

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.Dialog
import android.content.Intent
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.google.android.material.internal.ContextUtils.getActivity



class Register : AppCompatActivity() {
    var fechaS: String = ""
    lateinit var eDate: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        /*val sp_dias: Spinner = findViewById(R.id.sp_dia)
        val sp_mes: Spinner = findViewById(R.id.sp_mes)
        val sp_anio: Spinner = findViewById(R.id.sp_año)*/

        eDate  = findViewById(R.id.et_Date)
        eDate.setOnClickListener { showDatePickerDialog() }

        val btnpregunta : Button = findViewById(R.id.btn_iniciaSesión)
        val btnRegistrar : Button = findViewById(R.id.btn_creaCuenta)

        btnpregunta.setOnClickListener {
            val intent: Intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        btnRegistrar.setOnClickListener {
            val intent: Intent = Intent(this, Home::class.java)
            Toast.makeText(this, "Cuenta creada",Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }


    private fun showDatePickerDialog() {
        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    fun onDateSelected(day:Int, month:Int, year:Int){
        eDate.setText("$day/$month/$year")
    }
}