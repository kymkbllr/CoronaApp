package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UlkeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    UlkelerAdapter ulkelerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulke);
        recyclerView=findViewById(R.id.recyclerView);
        ulkelerAdapter =new UlkelerAdapter();
        ulkelerAdapter.setUlkeList(new ArrayList<Ulke>());
        RestInterface restInterface = ApiClient.getClient().create(RestInterface.class); /**interfaceyle retrofiti tanıstırdım**/
        Call<Ülkeler> call = restInterface.GetUlkeListesi("apikey 0vLVlrR3NFgNMNwhYcI7Yf:0USBjctvDSsha5egTHgfHx");
       call.enqueue(new Callback<Ülkeler>() {
           @Override
           public void onResponse(Call<Ülkeler> call, Response<Ülkeler> response) {
               
           }

           @Override
           public void onFailure(Call<Ülkeler> call, Throwable t) {

           }
       });
    }
}
