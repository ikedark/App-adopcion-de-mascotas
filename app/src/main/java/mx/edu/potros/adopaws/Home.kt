package mx.edu.potros.adopaws

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class Home : AppCompatActivity() {

    var lista: ArrayList<Mascota> = ArrayList<Mascota>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        agregarMascota()

        var gridview: GridView = findViewById(R.id.gridView) as GridView

        var adaptador: AdaptadorMascotas = AdaptadorMascotas(this,lista)
        gridview.adapter = adaptador

    }

    fun agregarMascota() {
        lista.add(Mascota("TIANA", R.drawable.tiana, "Hembra", "183"))
        lista.add(Mascota("BRUNO", R.drawable.bruno, "Macho", "230"))
        lista.add(Mascota("RESACA", R.drawable.resaca, "Hembra", "108"))
        lista.add(Mascota("TORIBIO", R.drawable.toribio, "Macho", "321"))
        lista.add(Mascota("PECHOCHO", R.drawable.pechocho, "Macho", "297"))
        lista.add(Mascota("DAISY", R.drawable.daisy, "Hembra", "350"))
    }

    private class AdaptadorMascotas: BaseAdapter {
        var mascotas=ArrayList<Mascota>()
        var contexto: Context?=null

        constructor(contexto: Context, mascota:ArrayList<Mascota>){
            this.mascotas=mascota
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return mascotas.size
        }

        override fun getItem(p0: Int): Any {
            return mascotas[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var masc=mascotas[p0]
            var inflador= LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.mascota_view,null)

            var imagen=vista.findViewById(R.id.mascota_img) as ImageView
            var nombre=vista.findViewById(R.id.nombre_mascota) as TextView
            var sexo = vista.findViewById(R.id.sexo_mascota) as TextView
            var likes=vista.findViewById(R.id.likes_mascota) as TextView

            imagen.setImageResource(masc.image)
            nombre.setText(masc.nombre)
            sexo.setText(masc.sexo)
            likes.setText(masc.likes)
            return vista
        }
    }

}