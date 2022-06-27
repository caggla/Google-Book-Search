package com.example.mvvm_rest_api.models;

import com.google.gson.annotations.Expose;

import java.util.List;

public class VolumesResponse {
    @Expose
    private String kind;

    @Expose
    List<Volume> items = null;

    @Expose
    int totalItems;

    public String getKind() {
        return kind;
    }

    public List<Volume> getItems() {
        return items;
    }

    public int getTotalItems() {
        return totalItems;
    }
}
