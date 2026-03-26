package com.example.studyproject2.HandlerController

import android.content.Context
import android.content.Intent
import com.example.studyproject2.ControllerActivity.MainActivity
import com.example.studyproject2.ControllerActivity.OneTaskActivity
import com.example.studyproject2.databinding.ActivityOneTaskBinding


class BackTransitionController(private val binding: ActivityOneTaskBinding, private val context: Context) {
    fun oneTask(){
        with(binding){
            tvTaskVault.setOnClickListener {
                controllerOneTaskActivity()
            }
        }
    }


    private fun controllerOneTaskActivity(){
        val intent = Intent(context, MainActivity::class.java)
        context.startActivity(intent)
    }

    //Единая функция для возращения на главный экран
    fun backMain(){
        with(binding){
            btn1Transit.setOnClickListener {
                controllerTransitActivity()
            }
        }
    }


    private fun controllerTransitActivity(){
        val intent = Intent(context, MainActivity::class.java)
        context.startActivity(intent)
    }

}