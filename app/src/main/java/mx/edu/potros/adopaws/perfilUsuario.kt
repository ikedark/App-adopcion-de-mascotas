package mx.edu.potros.adopaws

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.squareup.picasso.Picasso

class perfilUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_usuario)

        var tv_nombre: TextView = findViewById(R.id.tv_nombre_usuario)
        var iv_perfil: ImageView = findViewById(R.id.iv_perfil)
        val context : Context = this

        val bundle = intent.extras

        if (bundle != null){
            val profileImage = bundle.getInt("profileImage")
            val name = bundle.getString("name")
            tv_nombre.setText(name)
            //Picasso.with(context).load(profileImage).into(iv_perfil)
        }



    }

    private fun updateUI(acct: GoogleSignInAccount?){
        if (acct != null){
            val intent = Intent(this, Home::class.java)
            intent.putExtra("id",acct.getId())
            intent.putExtra("name",acct.getDisplayName())
            intent.putExtra("email",acct.getEmail())
            intent.putExtra("profileImage",acct.getPhotoUrl())
            startActivityForResult(intent,LOG_OUT)
        }
    }

}