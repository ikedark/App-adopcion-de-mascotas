package mx.edu.potros.adopaws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

class Home : AppCompatActivity() {
//    lateinit var mGoogleSignInClient: GoogleSignInClient
//    val RC_SIGN_IN = 343
//    val LOG_OUT = 234
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnHome: ImageButton = findViewById(R.id.btn_home)
        val btnMapa: ImageButton = findViewById(R.id.btn_map)
        val btnAvisos: ImageButton = findViewById(R.id.btn_warnings)
        val btnMensajes: ImageButton = findViewById(R.id.btn_messages)
        val btnProfile: ImageButton = findViewById(R.id.btn_profile)


//        val btnLogout: Button = findViewById(R.id.btnLogout)

        val bundle = intent.extras

        if (bundle != null){
            val name = bundle.getString("name")
            val email = bundle.getString("email")
        }

//        btnLogout.setOnClickListener {
//            finish()
//        }

        btnHome.setOnClickListener {
            val intent: Intent = Intent(this, Home::class.java)
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
            val intent: Intent = Intent(this, perfilUsuario::class.java)
            startActivity(intent)
        }

//        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//            .requestEmail()
//            .build()
//
//        // Build a GoogleSignInClient with the options specified by gso.
//        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
    }

//    override fun onStart() {
//        super.onStart()
//
//        val account = GoogleSignIn.getLastSignedInAccount(this)
//        updateUI(account)
//    }
//
//    private fun updateUI(acct: GoogleSignInAccount?){
//        if (acct != null){
//            val intent = Intent(this, perfilUsuario::class.java)
//            intent.putExtra("id",acct.getId())
//            intent.putExtra("name",acct.getDisplayName())
//            intent.putExtra("email",acct.getEmail())
//            intent.putExtra("profileImage",acct.getPhotoUrl())
//            startActivityForResult(intent,LOG_OUT)
//        }
//    }
}