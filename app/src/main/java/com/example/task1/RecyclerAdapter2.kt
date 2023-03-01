package com.example.task1

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.task1.databinding.RecyclerItem2Binding
import com.example.task1.databinding.RecyclerItemBinding
import com.example.task1.model.TotalModel

class RecyclerAdapter2(var listTotal:ArrayList<TotalModel>):RecyclerView.Adapter<RecyclerAdapter2.innerClass2>() {

    private lateinit var binding: RecyclerItem2Binding
    private lateinit var k :RecyclerAdapter2
    lateinit var a:TotalModel
//    lateinit var item:View

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): innerClass2 {

        binding = RecyclerItem2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return innerClass2(binding)
    }

    override fun getItemCount(): Int {
      return listTotal.size
    }

    override fun onBindViewHolder(holder: innerClass2, position: Int) {
        val adapterPosition = holder.adapterPosition
   holder.rate.setText(listTotal[position].total.toString())
//         item =holder.itemView
  }
    fun rv2(RvAdapter2:RecyclerAdapter2){
        k  = RvAdapter2
        Log.e("rv2", "rv2: "+k )
    }

    fun addNote2(view1:TotalModel,i:Int,position: Int) {
        if (listTotal.size<=i-1) {
            var view = TotalModel(view1.total)
            listTotal.add(view)
            notifyItemInserted(listTotal.size)
            Log.e("i", "addNote2: "+i )
            listTotal.set(position,TotalModel(view1.total))
        }
//        else{
//            listTotal.set(position,TotalModel(view1.total))
//        }



        else{
            var i=0

             a = TotalModel(view1.total)

            Log.e("simplelog", "$i++ "+listTotal )

            listTotal.set(position,TotalModel(view1.total))
            notifyDataSetChanged()
//            listTotal.removeAt(i)
//            notifyItemRemoved(listTotal.size)

//            listTotal.add(a)
//            notifyItemInserted(listTotal.size)
            Log.e("i", "addNote2: "+i )

        }
//        var k = item.id
//        when(k){
//            0 ->{  listTotal.removeAt(0)
//                notifyItemRemoved(listTotal.size)
//
//                listTotal.add(a)
//                notifyItemInserted(listTotal.size)}
//            1 ->{  listTotal.removeAt(1)
//                notifyItemRemoved(listTotal.size)
//
//                listTotal.add(a)
//                notifyItemInserted(listTotal.size)}
//            2 ->{  listTotal.removeAt(2)
//                notifyItemRemoved(listTotal.size)
//
//                listTotal.add(a)
//                notifyItemInserted(listTotal.size)}
//        }






    }
//    fun updateNote(view1:TotalModel){
//
//        if (listTotal.isEmpty().not()){
//            listTotal.removeAt(listTotal.size)
//        }
//        else{
//            var view = TotalModel(view1.total)
//            listTotal.add(view)
//            notifyItemInserted(listTotal.size)
//        }
//    }
 class innerClass2(private val binding: RecyclerItem2Binding) : RecyclerView.ViewHolder(binding.root) {

        var rate = binding.textView5 } }



