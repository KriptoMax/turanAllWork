package com.example.studyproject2.ControllerActivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.studyproject2.HandlerController.BackTransitionController
import com.example.studyproject2.HandlerController.TransitionController
import com.example.studyproject2.databinding.ActivitySevenTaskBinding

class SevenTaskActivity : AppCompatActivity() {

    private var _binding: ActivitySevenTaskBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for OneTaskActivity must not be null")

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        _binding = ActivitySevenTaskBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

    }

}