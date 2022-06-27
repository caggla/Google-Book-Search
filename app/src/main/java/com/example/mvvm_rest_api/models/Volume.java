package com.example.mvvm_rest_api.models;

import com.google.gson.annotations.Expose;

public class Volume {
    @Expose
    private String kind;

    @Expose
    private String id;

    @Expose
    private String etag;

    @Expose
    private String selfLink;

    @Expose
    VolumeInfo volumeInfo;

    public String getKind() {
        return kind;
    }

    public String getId() {
        return id;
    }

    public String getEtag() {
        return etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }
}
