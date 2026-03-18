package com.example.studyproject2.ControllerActivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.studyproject2.HandlerController.BackTransitionController
import com.example.studyproject2.HandlerController.TransitionController
import com.example.studyproject2.databinding.ActivityElevenTaskBinding

class ElevenTaskActivity : AppCompatActivity() {

    private var _binding: ActivityElevenTaskBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for OneTaskActivity must not be null")

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        _binding = ActivityElevenTaskBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

    }

}