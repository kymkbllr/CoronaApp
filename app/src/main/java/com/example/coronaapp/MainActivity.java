package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView toplam_olum_degeri;
    TextView toplam_vaka_degeri;
    TextView toplam_iyilesen_degeri;
    Button tümünü_gör;
    UlkelerAdapter ulkelerAdapter;
    String TAG ="tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        toplam_olum_degeri=findViewById(R.id.toplam_olum_degeri_tv);
        toplam_vaka_degeri=findViewById(R.id.toplam_vaka_degeri_tv);
        toplam_iyilesen_degeri=findViewById(R.id.toplam_iyilesen_degeri_tv);
        tümünü_gör=findViewById(R.id.tümünü_gör_btn);
        ulkelerAdapter=new UlkelerAdapter();
        ulkelerAdapter.setUlkeList(new ArrayList<Ulke>());
        recyclerView.setAdapter(ulkelerAdapter);

        tümünü_gör.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ıntent = new Intent(MainActivity.this, UlkeActivity.class);
                startActivity(ıntent);
            }
        });
        RestInterface restInterface =
                ApiClient.getClient().create(RestInterface.class); /**interfaceyle retrofiti tanıstırdım**/
        Call<TotalData> call = restInterface.GetTotalList("apikey 0vLVlrR3NFgNMNwhYcI7Yf:0USBjctvDSsha5egTHgfHx");
        call.enqueue(new Callback<TotalData>() {
            @Override
            public void onResponse(Call<TotalData> call, Response<TotalData> response) {
                if (response.isSuccessful()){
                    TotalData totalData =response.body();
                    toplam_olum_degeri.setText(totalData.getResult().getTotalDeaths());
                    toplam_vaka_degeri.setText(totalData.getResult().getTotalCases());
                    toplam_iyilesen_degeri.setText(totalData.getResult().getTotalRecovered());
                }
            }

            @Override
            public void onFailure(Call<TotalData> call, Throwable t) {
                Log.i(TAG, "onFailure: neden basarısız dönüyosun" +t.getMessage());
            }
        });

    }
}
