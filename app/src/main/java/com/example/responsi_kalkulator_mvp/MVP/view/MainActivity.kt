package com.example.responsi_kalkulator_mvp.MVP.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.responsi_kalkulator_mvp.R
import org.w3c.dom.Text
import java.text.DecimalFormat
import kotlinx.android.synthetic.main.activity_main.*

//private val Text.text: String
//    get() {}

class MainActivity : AppCompatActivity() {
    private lateinit var btn_clear: Button
    private lateinit var Kurungbuka: Button
    private lateinit var Kurungtutup: Button
    private lateinit var pembagian: Button
    private lateinit var No7: Button
    private lateinit var No8: Button
    private lateinit var No9: Button
    private lateinit var perkalian: Button
    private lateinit var No4: Button
    private lateinit var No5: Button
    private lateinit var No6: Button
    private lateinit var pengurangan: Button
    private lateinit var No1: Button
    private lateinit var No2: Button
    private lateinit var No3: Button
    private lateinit var pertambahan: Button
    private lateinit var btn0: Button
    private lateinit var btnTitik: Button
    private lateinit var Samadengan: Button
    private lateinit var input: Text
    private lateinit var output: Text

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_clear = findViewById(R.id.btnC)
        Kurungbuka = findViewById(R.id.btnkurungbuka)
        Kurungtutup = findViewById(R.id.btnkurungtutup)
        pembagian = findViewById(R.id.btnPembagian)
        No7 = findViewById(R.id.btn7)
        No8 = findViewById(R.id.btn8)
        No9 = findViewById(R.id.btn9)
        perkalian = findViewById(R.id.btnPerkalian)
        No4 = findViewById(R.id.btn4)
        No5 = findViewById(R.id.btn5)
        No6 = findViewById(R.id.btn6)
        pengurangan = findViewById(R.id.btnPengurangan)
        No1 = findViewById(R.id.btn1)
        No2 = findViewById(R.id.btn2)
        No3 = findViewById(R.id.btn3)
        pertambahan = findViewById(R.id.btnTambah)
        btn0 = findViewById(R.id.btn0)
        btnTitik = findViewById(R.id.btntitik)
        Samadengan = findViewById(R.id.btnSamaDengan)
        input = findViewById(R.id.txtinput)
        output = findViewById(R.id.tktoutput)

        btn_clear.setOnClickListener { 
            
        }


    }
}