package mx.edu.potros.adopaws

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
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
//    lateinit var mGoogleSignInClient: GoogleSignInClient
//    val RC_SIGN_IN = 343
//    val LOG_OUT = 234
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_usuario)

        var tv_nombre: TextView = findViewById(R.id.tv_nombre_usuario)
        var iv_perfil: ImageView = findViewById(R.id.iv_perfil)
        val context : Context = this

        val bundle = intent.extras

//        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//            .requestEmail()
//            .build()

//        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        if (bundle != null){
//            val profileImage = bundle.getInt("profileImage")
            val name = bundle.getString("name")
            tv_nombre.setText(name)
            //Picasso.with(context).load(profileImage).into(iv_perfil)
        }

        val btnHome: ImageButton = findViewById(R.id.btn_home)
        val btnMapa: ImageButton = findViewById(R.id.btn_map)
        val btnAvisos: ImageButton = findViewById(R.id.btn_warnings)
        val btnMensajes: ImageButton = findViewById(R.id.btn_messages)
        val btnProfile: ImageButton = findViewById(R.id.btn_profile)
        val btnConfig: ImageButton = findViewById(R.id.btn_Config)

        btnHome.setOnClickListener {
            val intent: Intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        btnProfile.setOnClickListener {
            val intent: Intent = Intent(this, perfilUsuario::class.java)
            startActivity(intent)
        }

        btnAvisos.setOnClickListener {
            val intent: Intent = Intent(this, buscarMascota::class.java)
            startActivity(intent)
        }

        btnConfig.setOnClickListener {
            val intent: Intent = Intent(this, configuracionGeneral::class.java)
            startActivity(intent)
        }

    }



//    override fun onStart() {
//        super.onStart()
//
//        val account = GoogleSignIn.getLastSignedInAccount(this)
//        updateUI(account)
//    }

    /*private fun updateUI(acct: GoogleSignInAccount?){
        if (acct != null){
            val intent = Intent(this, this::class.java)
            intent.putExtra("id",acct.getId())
            intent.putExtra("name",acct.getDisplayName())
            intent.putExtra("email",acct.getEmail())
            intent.putExtra("profileImage",acct.getPhotoUrl())
            startActivityForResult(intent,LOG_OUT)
        }
    }*/

}