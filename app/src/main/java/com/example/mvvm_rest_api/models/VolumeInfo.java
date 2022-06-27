package com.example.mvvm_rest_api.models;

import com.google.gson.annotations.Expose;

import java.util.List;

public class VolumeInfo {
    @Expose
    private String title;

    @Expose
    private List<String> authors = null;

    @Expose
    private String publisher;

    @Expose
    private String publishedDate;

    @Expose
    private String description;

    @Expose
    private int pageCount;

    @Expose
    private String printType;

    @Expose
    private VolumeImageLinks imageLinks;

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getPrintType() {
        return printType;
    }

    public VolumeImageLinks getImageLinks() {
        return imageLinks;
    }

}
