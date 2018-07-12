package com.tech.myapp.myapplication.entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Shemin on 7/11/2018.
 */

public class NewsItemEntity implements Serializable {

    @SerializedName("type")
    private String type;

    @SerializedName("title")
    private String title;

    @SerializedName("abstract")
    private String content_abstract;

    @SerializedName("published_date")
    private String published_date;

    @SerializedName("media")
    private ArrayList<MediaEntity> media;

    public ArrayList<MediaEntity> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<MediaEntity> media) {
        this.media = media;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent_abstract() {
        return content_abstract;
    }

    public void setContent_abstract(String content_abstract) {
        this.content_abstract = content_abstract;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }
}
