package com.keyur.raftis.gender;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.keyur.raftis.HomePage;
import com.keyur.raftis.MenRecyclerAdapter;
import com.keyur.raftis.R;
import com.keyur.raftis.RecyclerAdapter;

public class Men extends AppCompatActivity {
    ImageView menp1,menp2,menp3,p1,p2,p3,p4,p5,p6;
    Button btn;
    String url="https://firebasestorage.googleapis.com/v0/b/raftis-386c1.appspot.com/o/Men%2Fdesign2.JPG?alt=media&token=86e2300c-9a5b-45c9-ab90-a22aca761293";
    String url11="https://firebasestorage.googleapis.com/v0/b/raftis-386c1.appspot.com/o/Men%2Fdesign5.JPG?alt=media&token=5f5445c3-5043-418f-a69a-1980ae57d0c4";
    String url12="https://firebasestorage.googleapis.com/v0/b/raftis-386c1.appspot.com/o/Men%2Fdesign6.JPG?alt=media&token=5a3048e0-a176-4d24-b429-d0f40480e18d";
    String url13="https://firebasestorage.googleapis.com/v0/b/raftis-386c1.appspot.com/o/Men%2Fdeal11.PNG?alt=media&token=3137ee4e-2f19-45c6-803d-b8d067200192";
    String url14="https://firebasestorage.googleapis.com/v0/b/raftis-386c1.appspot.com/o/Men%2Fdeal12.PNG?alt=media&token=1db3268d-4ac5-40e2-8658-3a23a7fd8f8f";
    String url15="https://firebasestorage.googleapis.com/v0/b/raftis-386c1.appspot.com/o/Men%2Fdeal13.PNG?alt=media&token=12bd5b56-202a-4a90-b189-d905a619ccc9";
    String url16="https://firebasestorage.googleapis.com/v0/b/raftis-386c1.appspot.com/o/Men%2Fdeal14.PNG?alt=media&token=c5293da9-1ed6-4459-b57e-f77ca38cc4b3";
    String url17="https://firebasestorage.googleapis.com/v0/b/raftis-386c1.appspot.com/o/Men%2Fdeal15.PNG?alt=media&token=784f1795-950e-4716-aeac-1f8eb80bd0b9";
    String url18="https://firebasestorage.googleapis.com/v0/b/raftis-386c1.appspot.com/o/Men%2Fdeal16.PNG?alt=media&token=e5c594fe-ed1e-4329-89d2-3b4b281949ac";

    RecyclerView featuredRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);
        menp1=findViewById(R.id.womenp1);
        menp2=findViewById(R.id.womenp2);
        menp3=findViewById(R.id.womenp3);
        p1=findViewById(R.id.min1);
        p2=findViewById(R.id.min2);
        p3=findViewById(R.id.min3);
        p4=findViewById(R.id.under1);
        p5=findViewById(R.id.under2);
        p6=findViewById(R.id.under3);

        featuredRecycler=findViewById(R.id.women_recyceler);

        featuredRecycler.setLayoutManager(new LinearLayoutManager(this));
        featuredRecycler.setAdapter(new MenRecyclerAdapter());
        featuredRecycler();

        findViewById(R.id.women_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomePage.class));
            }
        });

    }


    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


    }

    @Override
    protected void onStart() {
        super.onStart();

        Glide.with(Men.this)
                .load(url)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(menp1);
        Glide.with(Men.this)
                .load(url11)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(menp2);
        Glide.with(Men.this)
                .load(url12)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(menp3);
        Glide.with(Men.this)
                .load(url13)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(p1);
        Glide.with(Men.this)
                .load(url14)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(p2);
        Glide.with(Men.this)
                .load(url15)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(p3);
        Glide.with(Men.this)
                .load(url16)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(p4);
        Glide.with(Men.this)
                .load(url17)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(p5);
        Glide.with(Men.this)
                .load(url18)
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(p6);


    }
}