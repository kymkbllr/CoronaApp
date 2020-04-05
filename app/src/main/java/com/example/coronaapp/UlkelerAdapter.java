package com.example.coronaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UlkelerAdapter extends RecyclerView.Adapter<UlkelerAdapter.MyHolder> {
    ArrayList<Ulke> ulkeList;
    public void setUlkeList(ArrayList<Ulke> ulkeList) {
        this.ulkeList = ulkeList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = (View) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.ulkeler_item, viewGroup, false);

        MyHolder vh = new MyHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.ulke_tv.setText(ulkeList.get(i).getCountry());
        myHolder.toplam_vaka_tv.setText(ulkeList.get(i).getTotalcases().toString());
        myHolder.yeni_vaka_tv.setText(ulkeList.get(i).getNewCases().toString());
        myHolder.toplam_ölüm_tv.setText(ulkeList.get(i).getTotaldeaths());

    }

    @Override
    public int getItemCount() {
        return ulkeList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        public TextView ulke_tv;
        public TextView toplam_vaka_tv;
        public TextView yeni_vaka_tv;
        public TextView toplam_ölüm_tv;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            ulke_tv = itemView.findViewById(R.id.ulke_tv);
            toplam_vaka_tv = itemView.findViewById(R.id.toplam_vaka_tv);
            yeni_vaka_tv = itemView.findViewById(R.id.yeni_vaka_tv);
            toplam_ölüm_tv = itemView.findViewById(R.id.toplam_ölüm_tv);
        }
    }

}
