package com.example.megatrustjobsapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.megatrustjobsapp.R
import kotlinx.android.synthetic.main.activity_job_details.*

class JobDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_details)

        companyNameTextView.text = "Company Name"
        companyLogoImageView.setImageResource(R.drawable.mega_trust_logo)
        jobTitleTextView.text = "Job Title"
        jobTypeTextView.text = "Job Type"
        jobUrlTextView.text = "https://www.job-url.com"
        companyUrlTextView.text = "https://www.company-url.com"
        jobDescriptionTextView.text = "Job Description"
    }
}