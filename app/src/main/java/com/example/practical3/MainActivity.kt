package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practical3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var student: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)





        binding.btnSetValue.setOnClickListener()
        {
            student = Student("Tiger", 21, "RSD")
            binding.myData = student
        }

        binding.btnDisplay.setOnClickListener()
        {
            student.programme = "RIS"

            binding.apply {
                invalidateAll()
            }
        }
    }
}