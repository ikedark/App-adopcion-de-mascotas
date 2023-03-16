package mx.edu.potros.adopaws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var time: Int = 100000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciar()
    }

    fun iniciar(){
        while (time > 0){
            time--
            if (time==0){
                val intent: Intent = Intent(this, Login::class.java)
                startActivity(intent)
            }
        }
    }
}