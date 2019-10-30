package com.example.papbrecyclerview.Model;

public class ItemModel {

    private int imageID;
    private String titleName;

    public ItemModel(int imageID, String titleName) {
        this.imageID = imageID;
        this.titleName = titleName;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }
}
