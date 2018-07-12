package com.tech.myapp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tech.myapp.myapplication.apis.ApiInterface;
import com.tech.myapp.myapplication.apis.ServiceGenerator;
import com.tech.myapp.myapplication.callbacks.NewsItemClickCallback;
import com.tech.myapp.myapplication.constants.Constants;
import com.tech.myapp.myapplication.entities.MainNewsFeedResponse;
import com.tech.myapp.myapplication.entities.NewsItemEntity;
import com.tech.myapp.myapplication.mainPage.MainPageAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements NewsItemClickCallback {

    private RecyclerView recyclerView;
    private MainPageAdapter adapter;
    private ArrayList<NewsItemEntity> entities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    private void initViews(){
        entities = new ArrayList<NewsItemEntity>();
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(llm);
        adapter = new MainPageAdapter(MainActivity.this,entities);
        recyclerView.setAdapter(adapter);
        callNewsfeedApi();
    }

    private void callNewsfeedApi() {
        ApiInterface client = ServiceGenerator.createService(ApiInterface.class);
        Call<MainNewsFeedResponse> call = client.getNewsFeed(Constants.API_KEY);
        call.enqueue(new Callback<MainNewsFeedResponse>() {
            @Override
            public void onResponse(Call<MainNewsFeedResponse> call, Response<MainNewsFeedResponse> response) {
                if(response.isSuccessful()){
                    entities.clear();
                    entities.addAll(response.body().getResults());
                    adapter.notifyDataSetChanged();
                }else {

                }
            }

            @Override
            public void onFailure(Call<MainNewsFeedResponse> call, Throwable t) {

            }
        });
    }

    @Override
    public void onItemClick(NewsItemEntity entity) {
        Intent i = new Intent(MainActivity.this,DetailsActivity.class);
        i.putExtra("obj",entity);
        startActivity(i);
    }
}
