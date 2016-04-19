package com.example.m14x.retrofitrecyclerview_itunes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.example.m14x.retrofitrecyclerview_itunes.Controller.CustomAdapter;
import com.example.m14x.retrofitrecyclerview_itunes.Model.Pojo;
import com.example.m14x.retrofitrecyclerview_itunes.Model.ResponseServer;
import com.example.m14x.retrofitrecyclerview_itunes.Model.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<Pojo> content = new ArrayList<>();
    private Call<ResponseServer> response;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);

        response = RetrofitInstance.apiService.getContent();
        response.enqueue(new Callback<ResponseServer>() {
            @Override
            public void onResponse(Call<ResponseServer> call, Response<ResponseServer> response) {
                content = response.body().getResults();
                CustomAdapter adapter = new CustomAdapter(getApplicationContext(),content);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ResponseServer> call, Throwable t) {

            }
        });


    }
}
