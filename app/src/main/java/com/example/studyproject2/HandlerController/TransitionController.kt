package com.example.studyproject2.HandlerController

import android.content.Context
import android.content.Intent
import com.example.studyproject2.ControllerActivity.MainActivity
import com.example.studyproject2.ControllerActivity.OneTaskActivity
import com.example.studyproject2.ControllerActivity.ThreeTaskActivity
import com.example.studyproject2.ControllerActivity.TwoTaskActivity
import com.example.studyproject2.databinding.ActivityMainBinding
import com.example.studyproject2.databinding.ActivityOneTaskBinding


class TransitionController(private val binding: ActivityMainBinding,
                           private val context: Context) {
    fun oneTask(){
        with(binding){
            btn2Task1.setOnClickListener {
                controllerOneTaskActivity()
            }
        }
    }
    fun twoTask(){
        with(binding){
            btn3Task2.setOnClickListener {
                controllerTwoTaskActivity()
            }
        }
    }
    fun threeTask(){
        with(binding){
            btn4Task3.setOnClickListener {
                controllerThreeTaskActivity()
            }
        }
    }


    private fun controllerOneTaskActivity(){
        val intent = Intent(context, OneTaskActivity::class.java)
        context.startActivity(intent)
    }
    private fun controllerTwoTaskActivity(){
        val intent = Intent(context, TwoTaskActivity::class.java)
        context.startActivity(intent)
    }
    private fun controllerThreeTaskActivity(){
        val intent = Intent(context, ThreeTaskActivity::class.java)
        context.startActivity(intent)
    }
}