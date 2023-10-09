package com.pjurado.ejercicio0302

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pjurado.ejercicio0302.databinding.ViewCiudadBinding

class CiudadesAdapter(val ciudades: List<Ciudad>) : RecyclerView.Adapter<CiudadesAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val binding = ViewCiudadBinding.bind(view)

        fun bind(ciudad: Ciudad) {

            with(binding){
                nombre.text = ciudad.nombre
                Glide.with(root.context)
                    .load(ciudad.urlImagen)
                    .into(imagen)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_ciudad, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = ciudades.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ciudades[position])
    }

}
