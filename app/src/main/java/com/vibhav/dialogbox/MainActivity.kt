package com.vibhav.dialogbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.vibhav.dialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure")
            builder1.setMessage("Do you want to close app")
            builder1.setIcon(R.drawable.ic_exit)
            builder1.setPositiveButton("yes", DialogInterface.OnClickListener { dialogInterface, i ->
                //what action should be perform when yes is clicked?
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                //what action should be perform when no is clicked?
            })
            builder1.show()
        }

        binding.button2.setOnClickListener {
            val options = arrayOf("Barcelona FC","Manchester City","Registan","Psg")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Where will messi go in summer 23")
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, which ->
                Toast.makeText(this,"You clicked on ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                //what action should be perform when yes is clicked?
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //what action should be perform when no is clicked?
            })
            builder2.show()
        }

        binding.button3.setOnClickListener {
            val options = arrayOf("Barcelona FC","Manchester City","Registan","Psg")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Where will messi go in summer 23")
            builder3.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialogInterface, which, isChecked ->
                Toast.makeText(this,"You clicked on ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                //what action should be perform when yes is clicked?
            })
            builder3.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                //what action should be perform when no is clicked?
            })
            builder3.show()
        }
    }
}