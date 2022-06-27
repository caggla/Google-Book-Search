package com.example.mvvm_rest_api.models;

import com.google.gson.annotations.Expose;

public class VolumeImageLinks {
    @Expose
    private String smallThumbnail;

    @Expose
    private String thumbnail;

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}
