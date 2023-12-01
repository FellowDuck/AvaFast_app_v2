package com.avafast.app.modules.comentariosone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.avafast.app.R
import com.avafast.app.databinding.RowListellipseeighteenBinding
import com.avafast.app.modules.comentariosone.`data`.model.ListellipseeighteenRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipseeighteenAdapter(
  var list: List<ListellipseeighteenRowModel>
) : RecyclerView.Adapter<ListellipseeighteenAdapter.RowListellipseeighteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipseeighteenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipseeighteen,parent,false)
    return RowListellipseeighteenVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipseeighteenVH, position: Int) {
    val listellipseeighteenRowModel = ListellipseeighteenRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipseeighteenRowModel = list[position]
    holder.binding.listellipseeighteenRowModel = listellipseeighteenRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipseeighteenRowModel>) {
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
      item: ListellipseeighteenRowModel
    ) {
    }
  }

  inner class RowListellipseeighteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipseeighteenBinding = RowListellipseeighteenBinding.bind(itemView)
  }
}
