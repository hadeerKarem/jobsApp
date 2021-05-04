package com.example.megatrustjobsapp.data;

import android.media.Image
import com.example.megatrustjobsapp.R

data class Job(
    var companyName: String,
    var companyLogo: Int,
    var jobTitle: String,
    var jobType: String,
    var jobUrl: String,
    var companyUrl: String,
    var jobDescription: String
    )


fun main(args: Array<String>) {
    val job = Job("Company Name",
        R.drawable.mega_trust_logo,
        "Job Title",
        "Job Type",
        "Job URL",
        "Company URL",
        "Job Description"
    )
}