package com.example.homepc.projectapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Base64;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_main);

        final String s = getIntent().getStringExtra("Image");
        System.out.println("\n==========\nGot base64 string:\n" + s + "\n==========");
        byte[] decodedString = Base64.decode(s, Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageBitmap(decodedByte);

        System.out.println("Set image.");
    }

}
