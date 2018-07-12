package com.tech.myapp.myapplication.entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by shemin on 7/12/2018.
 */

public class MediaEntity implements Serializable {
    @SerializedName("type")
    private String type;

    @SerializedName("caption")
    private String caption;

    @SerializedName("media-metadata")
    private ArrayList<MediaMetaEntity> mediaMeta;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public ArrayList<MediaMetaEntity> getMediaMeta() {
        return mediaMeta;
    }

    public void setMediaMeta(ArrayList<MediaMetaEntity> mediaMeta) {
        this.mediaMeta = mediaMeta;
    }
}
