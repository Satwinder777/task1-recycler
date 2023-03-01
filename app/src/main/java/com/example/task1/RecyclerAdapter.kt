package com.example.task1

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.task1.databinding.RecyclerItemBinding
import com.example.task1.model.TotalModel

class RecyclerAdapter(var DataList: MutableList<DataProject> ,private val dataUpdater: RecyclerAdapter2 ):RecyclerView.Adapter<RecyclerAdapter.innerClass>() {

    private lateinit var binding: RecyclerItemBinding
    var i:Int = 0
  @SuppressLint("SuspiciousIndentation")
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): innerClass {
 binding = RecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return innerClass(binding)

    }

    override fun getItemCount(): Int {
        return DataList.size
    }

    override fun onBindViewHolder(holder: innerClass, position: Int) {
  holder.addItemrv.setOnClickListener {
            var k = holder.rate.text.toString().toInt()
            var l =holder.hour.text.toString().toInt()
            val m = k*l
//            list.add(m.toString())
      var a=false

      if (a==false){
          dataUpdater.addNote2(TotalModel(m.toDouble()),DataList.size,position)
          a==true
      }
      else{
//          dataUpdater.updateNote(TotalModel(m.toDouble()))
          a == false
      }




        }  }

            fun addNote(view: DataProject) {
                var view = DataProject(2, 45)
                DataList.add(view)
                notifyItemInserted(DataList.size)
                i++
 }

    fun removeItem(position: Int) {
      if (DataList.isNotEmpty()){
          DataList.removeAt(position)
          notifyItemRemoved(position) }
    }
    class innerClass(private val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        var hour = binding.editText3
        var rate = binding.editText4
        val addItemrv = binding.button }


}





