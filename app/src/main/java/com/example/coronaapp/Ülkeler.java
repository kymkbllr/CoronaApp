package com.example.coronaapp;

import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.xml.transform.Result;


public class Ülkeler {
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("result")
    @Expose
    private List<Ulke> result = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Ulke> getResult() {
        return result;
    }

    public void setResult(List<Ulke> result) {
        this.result = result;
    }
}
