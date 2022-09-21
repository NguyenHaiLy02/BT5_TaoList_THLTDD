package com.example.bt5_taolist_thltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView ten;
    private TextView tacgia;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tacgia = findViewById(R.id.textviewTacGia);
        ten = findViewById(R.id.textviewTen);
        img=findViewById(R.id.imageviewHinh);

        String ten1 = getIntent().getStringExtra("Ten");
        String tacGia1 = getIntent().getStringExtra("TacGia");
        int hinh=getIntent().getIntExtra("Hinh",0);
        img.setImageResource(hinh);
        ten.setText(ten1);
        tacgia.setText(tacGia1);


    }
}