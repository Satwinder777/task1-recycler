package com.example.task1

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.task1.databinding.RecyclerItemBinding

class RecyclerAdapter(var DataList: MutableList<DataProject>, var editText: EditText, var editText2: EditText,var q:Int):RecyclerView.Adapter<RecyclerAdapter.innerClass>() {

    private lateinit var binding: RecyclerItemBinding
    private lateinit var recyclerView: RecyclerView

    var a=0
    var k =0

//    private val itemClickCount = mutableMapOf<Int, Int>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): innerClass {

        binding = RecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return innerClass(binding)

    }

    override fun getItemCount(): Int {
        return DataList.size
    }

    override fun onBindViewHolder(holder: innerClass, position: Int) {
        var ae = editText.text.toString()
        var ai = editText2.text.toString()
try {


    if (ai.isNullOrEmpty() || ae.isNullOrEmpty()) {

        Toast.makeText(holder.hour.context, "please enter value in", Toast.LENGTH_SHORT).show()

    }
    var total = ae.toInt() * ai.toInt() + q
    holder.rate.setText(total.toString())
    holder.hour.setText(ai)

    Log.e("ae", "onBindViewHolder: $q " + ae)
}
catch (e:Exception){
    Log.e("newexp", "onBindViewHolder: "+e.message )
}
//        var newText = holder.editText.text.toString()
//        Log.e("newText", "onBindViewHolder: "+newText )
//        a+=5
////        Log.e("text1", "onBindViewHolder: "+text1 )
//        holder.Rate = a.toString()
        holder.deleteButton.setOnClickListener {
            removeItem(holder.adapterPosition)

            q--
        }
//        var a= holder.Hour
//        val item = DataList[position]

    }

            fun addNote(view: DataProject) {
                var view = DataProject(2, 45)
                DataList.add(view)
                notifyItemInserted(DataList.size)
//                a++


            }

    fun removeItem(position: Int) {
      if (DataList.isNotEmpty()){
          DataList.removeAt(position)
          notifyItemRemoved(position)
//          a-=5
      }
    }
    fun increQ(){
        q++
    }

    class innerClass(private val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        var hour = binding.textView3
        var rate = binding.textView4
        val deleteButton = binding.button
//        var editText:EditText =itemView.findViewById(R.id.textView2)


    }


}



