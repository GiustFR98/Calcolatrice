package com.example.calcolatrice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{  //Ricorda di aggiungere la classe View.OnClickListener perchè devi fare override del suo metodo onClick

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
    }

    override fun onClick(v: View){

        val a = input1.text.toString().toInt()
        val b = input2.text.toString().toInt()
        val c: Int
        when (v.id){
            btn1.id -> c=a*b
            btn2.id -> c=a/b
            btn3.id -> c=a+b
            btn4.id -> c=a-b
            else -> c=0
        }
        result.setText(c.toString())
    }

}
