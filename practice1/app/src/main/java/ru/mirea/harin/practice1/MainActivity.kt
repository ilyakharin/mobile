package ru.mirea.harin.practice1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var tvOut: TextView? = null
    private var OK: Button? = null
    private var Cancel: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvOut = findViewById<View>(R.id.tvOut) as TextView
        OK = findViewById<View>(R.id.btnOk) as Button
        Cancel = findViewById<View>(R.id.btnCancel) as Button
        val BtnOK =
            View.OnClickListener { tvOut!!.text = "You've clicked OK button" }
        OK!!.setOnClickListener(BtnOK)
        val BtnCancel =
            View.OnClickListener { tvOut!!.text = "You'vw clicked CANCEL button" }
        Cancel!!.setOnClickListener(BtnCancel)

    }

}