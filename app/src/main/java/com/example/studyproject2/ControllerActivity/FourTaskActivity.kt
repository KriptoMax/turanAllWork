package com.example.studyproject2.ControllerActivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.studyproject2.HandlerController.BackTransitionController
import com.example.studyproject2.HandlerController.TransitionController
import com.example.studyproject2.databinding.ActivityFourTaskBinding

class FourTaskActivity : AppCompatActivity() {

    private var _binding: ActivityFourTaskBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for OneTaskActivity must not be null")

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        _binding = ActivityFourTaskBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        with(binding){

        }

        backMain()
    }


    //Единая функция для возращения на главный экран
    private fun backMain(){
        with(binding){
            tvTaskVault.setOnClickListener {
                val intent = Intent(this@FourTaskActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}