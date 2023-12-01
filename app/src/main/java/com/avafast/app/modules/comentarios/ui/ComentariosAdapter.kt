package com.avafast.app.modules.comentarios.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.avafast.app.R
import com.avafast.app.databinding.RowComentariosBinding
import com.avafast.app.modules.comentarios.`data`.model.ComentariosRowModel
import kotlin.Int
import kotlin.collections.List

class ComentariosAdapter(
  var list: List<ComentariosRowModel>
) : RecyclerView.Adapter<ComentariosAdapter.RowComentariosVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowComentariosVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_comentarios,parent,false)
    return RowComentariosVH(view)
  }

  override fun onBindViewHolder(holder: RowComentariosVH, position: Int) {
    val comentariosRowModel = ComentariosRowModel()
    // TODO uncomment following line after integration with data source
    // val comentariosRowModel = list[position]
    holder.binding.comentariosRowModel = comentariosRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ComentariosRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ComentariosRowModel
    ) {
    }
  }

  inner class RowComentariosVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowComentariosBinding = RowComentariosBinding.bind(itemView)
  }
}
