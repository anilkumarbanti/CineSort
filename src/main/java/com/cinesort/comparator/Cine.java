package com.cinesort.comparator;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

// Cine class without Comparable
public class Cine {
    private String CineName;
    private int CineId;
    private double CineRating;
    private int CineYear;

    public Cine(String CineName, int CineId, double CineRating, int CineYear) {
        this.CineName = CineName;
        this.CineId = CineId;
        this.CineRating = CineRating;
        this.CineYear = CineYear;
    }

    public String getCineName() {
        return CineName;
    }

    public int getCineId() {
        return CineId;
    }

    public double getCineRating() {
        return CineRating;
    }

    public int getCineYear() {
        return CineYear;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "CineName='" + CineName + '\'' +
                ", CineId=" + CineId +
                ", CineRating=" + CineRating +
                ", CineYear=" + CineYear +
                '}';
    }
}









