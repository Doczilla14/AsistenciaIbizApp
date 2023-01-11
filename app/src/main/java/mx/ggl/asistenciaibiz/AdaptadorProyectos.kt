package mx.ggl.asistenciaibiz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorProyectos (private val ProyectosData: List<String>): RecyclerView.Adapter<AdaptadorProyectos.ProyectosViewHolder>(){
    inner class ProyectosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val proyectosTV:TextView=itemView.findViewById<TextView>(R.id.item_tv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProyectosViewHolder {
        val inflater = LayoutInflater.from(parent?.context)
        return ProyectosViewHolder((inflater.inflate(R.layout.list_item,parent,false)))
    }

    override fun onBindViewHolder(holder: ProyectosViewHolder, position: Int) {
        holder.proyectosTV?.text = ProyectosData[position]
    }

    override fun getItemCount(): Int {
        return ProyectosData.size

    }
}