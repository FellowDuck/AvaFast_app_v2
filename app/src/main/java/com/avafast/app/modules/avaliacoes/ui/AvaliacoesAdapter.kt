package com.avafast.app.modules.avaliacoes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.avafast.app.R
import com.avafast.app.databinding.RowAvaliacoesBinding
import com.avafast.app.modules.avaliacoes.`data`.model.AvaliacoesRowModel
import kotlin.Int
import kotlin.collections.List

class AvaliacoesAdapter(
  var list: List<AvaliacoesRowModel>
) : RecyclerView.Adapter<AvaliacoesAdapter.RowAvaliacoesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAvaliacoesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_avaliacoes,parent,false)
    return RowAvaliacoesVH(view)
  }

  override fun onBindViewHolder(holder: RowAvaliacoesVH, position: Int) {
    val avaliacoesRowModel = AvaliacoesRowModel()
    // TODO uncomment following line after integration with data source
    // val avaliacoesRowModel = list[position]
    holder.binding.avaliacoesRowModel = avaliacoesRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AvaliacoesRowModel>) {
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
      item: AvaliacoesRowModel
    ) {
    }
  }

  inner class RowAvaliacoesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAvaliacoesBinding = RowAvaliacoesBinding.bind(itemView)
  }
}
