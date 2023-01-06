package mx.ggl.asistenciaibiz

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class AdaptadorProyectos (private val ProyectosData: List<String>): RecyclerView.Adapter<>{
    inner class ProyectosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}