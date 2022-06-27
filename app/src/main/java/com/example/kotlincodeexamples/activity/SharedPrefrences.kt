package com.example.kotlincodeexamples.activity

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlincodeexamples.R
import com.example.kotlincodeexamples.databinding.ActivityMainBinding
import com.example.kotlincodeexamples.databinding.ActivitySharedPrefrencesBinding

class SharedPrefrences : AppCompatActivity() {

    private val sharedPrefFile = "kotlinsharedprefrences"
    private lateinit var binding: ActivitySharedPrefrencesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_prefrences)

        val sharedPrefrences : SharedPreferences = this.getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)
        binding.btnSave.setOnClickListener(View.OnClickListener {
            val id : Int = Integer.parseInt(binding.editValue.text.toString())
            val name : String = binding.editName.text.toString()
            val editor : SharedPreferences.Editor = sharedPrefrences.edit()
            editor.putInt("id_key",id)
            editor.putString("name_key",name)
            editor.apply()
            editor.commit()
        })
        binding.btnView.setOnClickListener(View.OnClickListener {
            val sharedValue = sharedPrefrences.getInt("id_key",0)
            val sharedNameValue = sharedPrefrences.getString("name_key","defaultname")
            if (sharedValue.equals(0)&&sharedNameValue.equals("defaultname")) {
                binding.tvName.text = ("default name: ${sharedNameValue}").toString()
                binding.tvValue.text = ("default value: ${sharedValue}").toString()
            } else {
                binding.tvName.text = (sharedNameValue).toString()
                binding.tvValue.text = (sharedValue).toString()

            }

        })
        binding.btnClear.setOnClickListener(View.OnClickListener {
            val editor = sharedPrefrences.edit()
            editor.clear()
            editor.apply()
            binding.tvValue.text = ("").toString()
            binding.tvValue.text = ("").toString()
        })
    }
}