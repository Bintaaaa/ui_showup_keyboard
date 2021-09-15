package com.example.submission_android_pemula.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.submission_android_pemula.R

class DetailKeyboard : AppCompatActivity() {

    companion object{
        const val  EXTRA_TITLE = "extra_title"
        const val  EXTRA_IMAGE = "extra_image"
        const val  EXTRA_PRICE = "extra_price"
        const val  EXTRA_COMPANY = "extra_company"
        const val  EXTRA_DETAIL = "extra_detail"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_keyboard)

        getDetailKeyboard()

        btnBack()


    }
    private fun getDetailKeyboard(){

        val tvTitle: TextView = findViewById(R.id.tv_title_detail)
        val ivKeyboard: ImageView = findViewById(R.id.iv_keyboard_detail)
        val tvPrice: TextView = findViewById(R.id.tv_price_detail)
        val tvCompany: TextView = findViewById(R.id.tv_company)
        val tvDetail: TextView = findViewById(R.id.tv_detail)
        val constrainDetail: View = findViewById(R.id.cons_detail)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val image = intent.getIntExtra(EXTRA_IMAGE,0)
        val price = intent.getStringExtra(EXTRA_PRICE)
        val company = intent.getStringExtra(EXTRA_COMPANY)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        tvTitle.text = title
        tvPrice.text = price
        tvCompany.text = "Production by $company"
        tvDetail.text = detail

        Glide.with(constrainDetail)
            .load(image)
            .into(ivKeyboard)

    }

    private fun btnBack(){
        val btnBack: ImageButton = findViewById(R.id.btn_back)
        btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}