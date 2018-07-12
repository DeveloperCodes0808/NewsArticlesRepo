package com.tech.myapp.myapplication.entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by shemin on 7/12/2018.
 */

public class MediaMetaEntity implements Serializable {
    @SerializedName("url")
    private String url;

    @SerializedName("format")
    private String format;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
