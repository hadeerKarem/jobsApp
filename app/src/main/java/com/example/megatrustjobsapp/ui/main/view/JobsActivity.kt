package com.example.megatrustjobsapp.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.megatrustjobsapp.R
import com.example.megatrustjobsapp.ui.main.adapter.RecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_jobs.*


class JobsActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jobs)

        linearLayoutManager = LinearLayoutManager(this)
        val jobNames: ArrayList<String> = ArrayList()
        jobNames.add("Engineer")
        jobNames.add("Android Developer")
        jobNames.add("Back-end Developer")
        jobNames.add("Front-end Developer")
        jobNames.add("Full stack Developer")
        jobNames.add("Dummy")

        // set up the RecyclerView
        jobsRecyclerView.layoutManager = linearLayoutManager
        recyclerViewAdapter = RecyclerViewAdapter(jobNames)
        jobsRecyclerView.adapter = recyclerViewAdapter

//        jobsRecyclerView.adapter = recyclerViewAdapter
    }
}