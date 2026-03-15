package com.example.studyproject2.HandlerController

import android.content.Context
import android.content.Intent
import com.example.studyproject2.ControllerActivity.MainActivity
import com.example.studyproject2.ControllerActivity.OneTaskActivity
import com.example.studyproject2.databinding.ActivityMainBinding
import com.example.studyproject2.databinding.ActivityOneTaskBinding


class TransitionController(private val binding: ActivityMainBinding, private val context: Context) {
    fun setup(){
        with(binding){
            btn2Task1.setOnClickListener {
                controllerOneTaskActivity()
            }
        }
    }


    private fun controllerOneTaskActivity(){
        val intent = Intent(context, OneTaskActivity::class.java)
        context.startActivity(intent)
    }
}