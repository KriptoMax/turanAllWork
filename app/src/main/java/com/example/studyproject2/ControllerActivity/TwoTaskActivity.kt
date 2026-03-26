package com.example.studyproject2.ControllerActivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.studyproject2.HandlerController.BackTransitionController
import com.example.studyproject2.HandlerController.TransitionController
import com.example.studyproject2.databinding.ActivityTwoTaskBinding

class TwoTaskActivity : AppCompatActivity() {

    private var counter: Int = 0

    private var _binding: ActivityTwoTaskBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for TwoTaskActivity must not be null")

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        _binding = ActivityTwoTaskBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        with(binding){

            btnHello.setOnClickListener {
                tvDeduction.text = "Приветствую мой Господин"
            }

            btnCheck.setOnClickListener {
                tvDeduction.text = "Вы нажали на кнопку ${++counter}"
            }

        }


        backMain()
    }


    //Единая функция для возращения на главный экран
    private fun backMain(){
        with(binding){
            tvTaskVault.setOnClickListener {
                val intent = Intent(this@TwoTaskActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}