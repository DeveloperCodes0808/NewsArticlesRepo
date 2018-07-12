package com.tech.myapp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.tech.myapp.myapplication.entities.NewsItemEntity;

public class DetailsActivity extends AppCompatActivity {

    private NewsItemEntity entity;

    private ImageView ivImage;
    private TextView tvTitle;
    private TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ivImage = (ImageView)findViewById(R.id.ivImage);
        tvTitle = (TextView)findViewById(R.id.tvTitle);
        tvContent = (TextView)findViewById(R.id.tvContent);
        entity = (NewsItemEntity) getIntent().getSerializableExtra("obj");
        Log.e("DetailsActivity","url======="+entity.getMedia().get(0).getMediaMeta().get(4).getUrl());

        Picasso.with(DetailsActivity.this).load(entity.getMedia().get(0).getMediaMeta().get(4).getUrl())
                .into(ivImage);
        tvTitle.setText(entity.getTitle());
        tvContent.setText(entity.getContent_abstract());
    }
}
