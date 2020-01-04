package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.Bitmap as Bitmap1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_cam.setOnClickListener {
            var i=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(i,123)

        }
    }

     override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==123)
        {
            var bmp= data?.extras?.get("data") as Bitmap1
            iv_cam.setImageBitmap(bmp)
        }
    }

}
