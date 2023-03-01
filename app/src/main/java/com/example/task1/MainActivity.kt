package com.example.task1

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Adapter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task1.databinding.ActivityMainBinding
import com.example.task1.model.TotalModel
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private val myList = mutableListOf<String>()

    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerView2: RecyclerView
    var adapter2: MutableList<RecyclerAdapter2> = mutableListOf()
    var totalList = ArrayList<TotalModel>()
    lateinit var dataProject: ArrayList<DataProject>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var cartAdapter2 = RecyclerAdapter2(totalList)
        adapter2.add(cartAdapter2)
        recyclerView = binding.recyclerView
        recyclerView2 = binding.recyclerView2
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView2.layoutManager = LinearLayoutManager(this)
        dataProject = ArrayList()

        val cartAdapter = RecyclerAdapter(dataProject, cartAdapter2)
        cartAdapter2.rv2(cartAdapter2)


        binding.recyclerView.adapter = cartAdapter
        binding.recyclerView2.adapter = cartAdapter2

        binding.button2.setOnClickListener {
            var note = DataProject(23, 56)
            cartAdapter.addNote(note)
//            totalList.clear()
//            totalList.add(TotalModel(12.00))

        }
    }
}

