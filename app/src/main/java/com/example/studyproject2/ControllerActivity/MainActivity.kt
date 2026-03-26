package com.example.studyproject2.ControllerActivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.studyproject2.HandlerController.BackTransitionController
import com.example.studyproject2.HandlerController.TransitionController
import com.example.studyproject2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for MainActivity must not be null") //ActivityLearnWordBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        //setOnclickListener()
        val controller = TransitionController(binding, this)
        controller.oneTask()
        controller.twoTask()
        controller.threeTask()
    }
}