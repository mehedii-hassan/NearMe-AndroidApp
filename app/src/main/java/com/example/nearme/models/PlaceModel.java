package com.example.nearme.models;

import com.example.nearme.R;

import java.util.ArrayList;
import java.util.Arrays;

public class PlaceModel {
    int id;
    int drawableId;
    String name;
    String placeType;

    public PlaceModel() {
    }

    public PlaceModel(int id, int drawableId, String name, String placeType) {
        this.id = id;
        this.drawableId = drawableId;
        this.name = name;
        this.placeType = placeType;
    }

    public int getId() {


        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }


}
