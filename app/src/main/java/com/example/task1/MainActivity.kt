package com.example.task1

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task1.databinding.ActivityMainBinding
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private val myList = mutableListOf<String>()
    private lateinit var dataProject: ArrayList<DataProject>
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    var a = 0
//    var s: Editable = "" as Editable

    var l: ArrayList<String> = ArrayList()
    var k = "0"
    var arr1: MutableList<Int> = mutableListOf()

//    var a = binding.textView.text
//    var b = binding.textView2.text
//    var arr:ArrayList<DataProject> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        var ival: Int
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//


//             InterfaceData.onClickevent(holder.adapterPosition)
        recyclerView = binding.recyclerView

//        var assignText = binding.textView2.text.toString()






        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        AddData()
//           val  cartAdapter= RecyclerAdapter(dataProject )
        var editText :EditText = findViewById(R.id.textView)
        var editText2 :EditText = findViewById(R.id.textView2)

        val cartAdapter = RecyclerAdapter(dataProject, editText,editText2,a)

        binding.recyclerView.adapter = cartAdapter
        var textView = binding.textView

//        var arr :ArrayList<Int> = ArrayList()
//        textView.
        binding.button2.setOnClickListener {
//            textView.text =
            var note = DataProject(23, 56)
            cartAdapter.addNote(note)

//            Log.e("arra", "addView: " + araa.size)


//             for (i in 1..1){
                 a++
            cartAdapter.increQ()
//             }
//                 var n = 20*a
//                 arr1?.add(n)
//            val viewHolder = recyclerView.findViewHolderForAdapterPosition(arr1.size)
//            if (viewHolder is RecyclerAdapter.innerClass) {
//                viewHolder.Hour.text = "${arr1[a]}"
//                Log.e("newvalueisthe", "incree: " + a + k)
//            }
//            Log.e("test", "onCreate: "+arr1 )
             var text2 = binding.textView2.text.toString()
              var text1 = binding.textView.text.toString()
            Log.e("text", "first value is:  $text1 , first value is:$text2"  )
        }

        try {
//            binding.textView.
        } catch (e: java.lang.Exception) {
            Log.e("testcase", "onCreate: " + e.message)
        }
    }
            lateinit var araa: Array<Int>
            fun AddData() {
            dataProject = ArrayList()
            araa = arrayOf(



            )

                for (i in araa.indices) {




        }
                Log.e("a", "value of a is: "+a)
    }






}
