package com.example.megatrustjobsapp.viewmodel

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.example.megatrustjobsapp.R
import com.example.megatrustjobsapp.ui.view.JobDetailsActivity
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class RecyclerViewAdapter(private val jobsArrayList: ArrayList<String>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    private val TAG = "recyclerViewAdapterTag"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    : RecyclerViewAdapter.ViewHolder {
        val inflatedView = parent.inflate(R.layout.recyclerview_item_row, false)
        return ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        val itemJob = jobsArrayList[position]
        holder.bindJob(itemJob)
    }

    override fun getItemCount() = jobsArrayList.size

    private fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false) : View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

    companion object {
        private val JOB_KEY = "JOB"
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var view : View = v
        private var text: String? = null

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val context = itemView.context
            val showJobIntent = Intent(context, JobDetailsActivity::class.java)
            showJobIntent.putExtra(JOB_KEY, text)
            context.startActivity(showJobIntent)
        }

        fun bindJob(job: String) {
            view.jobNameTextView.text = "Job Title"
        }
    }
}

//class RecyclerViewAdapter internal constructor(context: Context?, data: List<String>) :
//    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
//    private val mData: List<String>
//    private val mInflater: LayoutInflater
//    private var mClickListener: ItemClickListener? = null
//
//    // inflates the row layout from xml when needed
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view: View = mInflater.inflate(R.layout.recyclerview_item_row, parent, false)
//        return ViewHolder(view)
//    }
//
//    // binds the data to the TextView in each row
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val job = mData[position]
//        holder.myTextView.text = job
//    }
//
//    // total number of rows
//    override fun getItemCount(): Int {
//        return mData.size
//    }
//
//    // stores and recycles views as they are scrolled off screen
//    inner class ViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView),
//        View.OnClickListener {
//        var myTextView: TextView
//        override fun onClick(view: View?) {
//            if (mClickListener != null) mClickListener!!.onItemClick(view, adapterPosition)
//        }
//
//        init {
//            myTextView = itemView.findViewById(R.id.jobNameTextView)
//            itemView.setOnClickListener(this)
//        }
//    }
//
//    // convenience method for getting data at click position
//    fun getItem(id: Int): String {
//        return mData[id]
//    }
//
//    // allows clicks events to be caught
//    fun setClickListener(itemClickListener: ItemClickListener?) {
//        mClickListener = itemClickListener
//    }
//
//    // parent activity will implement this method to respond to click events
//    interface ItemClickListener {
//        fun onItemClick(view: View?, position: Int)
//    }
//
//    // data is passed into the constructor
//    init {
//        mInflater = LayoutInflater.from(context)
//        mData = data
//    }
//}