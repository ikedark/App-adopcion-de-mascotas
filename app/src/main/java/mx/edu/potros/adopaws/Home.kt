package mx.edu.potros.adopaws

import android.content.Context
import android.content.Intent
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

        val buttonBuscarMascota: ImageButton = findViewById(R.id.btn_buscarMascota)

        buttonBuscarMascota.setOnClickListener(){
            var intent: Intent =Intent(this,Buscar_Mascota::class.java)
            startActivity(intent)
        }

        agregarMascota()

        var gridview: GridView = findViewById(R.id.gridView) as GridView

        var adaptador: AdaptadorMascotas = AdaptadorMascotas(this,lista)
        gridview.adapter = adaptador

    }

    fun agregarMascota() {
        lista.add(Mascota(R.drawable.tiana,"TIANA", "Adulto, 3 años", "Hembra", "gato", "mediano","Negro con blanco","juguetón,enérgico,chipilon.","Amigable con los niños, perros y gatos","183",R.drawable.dross1,R.drawable.dross2,R.drawable.dross3,R.drawable.dross4,R.drawable.dross5,R.drawable.dross6,"desde el principio de los tiempos"))
        lista.add(Mascota(R.drawable.bruno,"BRUNO", "Adulto, 3 años", "Macho", "perro", "mediano","Negro con blanco","juguetón,enérgico,chipilon.","Amigable con los niños, perros y gatos","230",R.drawable.dross1,R.drawable.dross2,R.drawable.dross3,R.drawable.dross4,R.drawable.dross5,R.drawable.dross6,"desde el principio de los tiempos"))
        lista.add(Mascota(R.drawable.resaca,"RESACA", "Adulto, 3 años", "Hembra", "perro", "mediano","Negro con blanco","juguetón,enérgico,chipilon.","Amigable con los niños, perros y gatos","108",R.drawable.dross1,R.drawable.dross2,R.drawable.dross3,R.drawable.dross4,R.drawable.dross5,R.drawable.dross6,"desde el principio de los tiempos"))
        lista.add(Mascota(R.drawable.toribio,"TORIBIO", "Adulto, 3 años", "Macho", "perro", "mediano","Negro con blanco","juguetón,enérgico,chipilon.","Amigable con los niños, perros y gatos","321",R.drawable.dross1,R.drawable.dross2,R.drawable.dross3,R.drawable.dross4,R.drawable.dross5,R.drawable.dross6,"desde el principio de los tiempos"))
        lista.add(Mascota(R.drawable.pechocho,"PECHOCHO", "Adulto, 3 años", "Macho", "gato", "mediano","Negro con blanco","juguetón,enérgico,chipilon.","Amigable con los niños, perros y gatos","297",R.drawable.dross1,R.drawable.dross2,R.drawable.dross3,R.drawable.dross4,R.drawable.dross5,R.drawable.dross6,"desde el principio de los tiempos"))
        lista.add(Mascota(R.drawable.daisy,"DAISY", "Adulto, 3 años", "Hembra", "perro", "mediano","Negro con blanco","juguetón,enérgico,chipilon.","Amigable con los niños, perros y gatos","250",R.drawable.dross1,R.drawable.dross2,R.drawable.dross3,R.drawable.dross4,R.drawable.dross5,R.drawable.dross6,"desde el principio de los tiempos"))
        lista.add(Mascota(R.drawable.dross_perfil,"DROSS", "Adulto, 3 años", "Macho", "perro,mestizo", "mediano","Negro con blanco","juguetón,enérgico,chipilon.","Amigable con los niños, perros y gatos","185",R.drawable.dross1,R.drawable.dross2,R.drawable.dross3,R.drawable.dross4,R.drawable.dross5,R.drawable.dross6,"desde el principio de los tiempos"))

    }

    class AdaptadorMascotas: BaseAdapter {
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


            imagen.setOnClickListener(){
                var intento = Intent(contexto,Perfil_Mascota::class.java)
                intento.putExtra("imagen",masc.image)
                intento.putExtra("nombre",masc.nombre)
                intento.putExtra("sexo",masc.sexo)
                intento.putExtra("edad",masc.edad)
                intento.putExtra("raza",masc.raza)
                intento.putExtra("tamanio",masc.tamanio)
                intento.putExtra("colores",masc.colores)
                intento.putExtra("personalidad",masc.personalidad)
                intento.putExtra("social",masc.social)
                intento.putExtra("perfil1",masc.image1)
                intento.putExtra("perfil2",masc.image2)
                intento.putExtra("perfil3",masc.image3)
                intento.putExtra("perfil4",masc.image4)
                intento.putExtra("perfil5",masc.image5)
                intento.putExtra("perfil6",masc.image6)
                contexto!!.startActivity(intento)
            }

            return vista
        }
    }

}