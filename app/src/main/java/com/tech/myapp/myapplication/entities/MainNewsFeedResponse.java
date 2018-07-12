package com.tech.myapp.myapplication.entities;

import java.util.ArrayList;

/**
 * Created by Shemin on 7/11/2018.
 */

public class MainNewsFeedResponse {
    private String status;
    private String copyright;
    private int num_results;
    private ArrayList<NewsItemEntity> results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }

    public ArrayList<NewsItemEntity> getResults() {
        return results;
    }

    public void setResults(ArrayList<NewsItemEntity> results) {
        this.results = results;
    }
}
