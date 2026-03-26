package com.example.studyproject2.ControllerActivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.studyproject2.HandlerController.BackTransitionController
import com.example.studyproject2.HandlerController.TransitionController
import com.example.studyproject2.R
import com.example.studyproject2.databinding.ActivityThreeTaskBinding

class ThreeTaskActivity : AppCompatActivity() {

    private var _binding: ActivityThreeTaskBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for OneTaskActivity must not be null")

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        _binding = ActivityThreeTaskBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        with(binding){

            btnSetColor1.setOnClickListener {
                tvDeduction.text = "Красный"
                main.setBackgroundColor(resources.getColor(R.color.red))
            }
            btnSetColor2.setOnClickListener {
                tvDeduction.text = "Жёлтый"
                main.setBackgroundColor(resources.getColor(R.color.yellow))
            }
            btnSetColor3.setOnClickListener {
                tvDeduction.text = "Зелёный"
                main.setBackgroundColor(resources.getColor(R.color.green))
            }

        }



        backMain()
    }


    //Единая функция для возращения на главный экран
    private fun backMain(){
        with(binding){
            tvTaskVault.setOnClickListener {
                val intent = Intent(this@ThreeTaskActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}