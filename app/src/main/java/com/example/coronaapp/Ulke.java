package com.example.coronaapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ulke {
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("totalcases")
    @Expose
    private String totalcases;
    @SerializedName("newCases")
    @Expose
    private String newCases;
    @SerializedName("totaldeaths")
    @Expose
    private String totaldeaths;
    @SerializedName("newDeaths")
    @Expose
    private String newDeaths;
    @SerializedName("totalRecovered")
    @Expose
    private String totalRecovered;
    @SerializedName("activeCases")
    @Expose
    private String activeCases;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTotalcases() {
        return totalcases;
    }

    public void setTotalcases(String totalcases) {
        this.totalcases = totalcases;
    }

    public String getNewCases() {
        return newCases;
    }

    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public String getTotaldeaths() {
        return totaldeaths;
    }

    public void setTotaldeaths(String totaldeaths) {
        this.totaldeaths = totaldeaths;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public String getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
    }
}
