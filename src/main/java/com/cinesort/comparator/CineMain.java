package com.cinesort.comparator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.cinesort.comparator.comparators.CineIdComparator;
import com.cinesort.comparator.comparators.CineNameComparator;
import com.cinesort.comparator.comparators.CineRatingComparator;
import com.cinesort.comparator.comparators.CineYearComparator;

public class CineMain {
    public static void main(String[] args) {
        List<Cine> Cines = new ArrayList<>();

        // Read JSON file
        try (BufferedReader reader = new BufferedReader(new FileReader("Cines.json"))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            JSONArray jsonArray = new JSONArray(jsonContent.toString());

            // Parse JSON data and create Cine objects
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String CineName = jsonObject.getString("cineName");
                int CineId = jsonObject.getInt("cineId");
                double CineRating = jsonObject.getDouble("cineRating");
                int CineYear = jsonObject.getInt("cineYear");
                Cines.add(new Cine(CineName, CineId, CineRating, CineYear));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Original list of Cines
        System.out.println("Cines before sorting by ID:");
        for (Cine Cine : Cines) {
            System.out.println(Cine);
        }

        // Sorting by ID (Comparator)
        Collections.sort(Cines, new CineIdComparator());
        System.out.println("\nCines after sorting by ID:");
        for (Cine Cine : Cines) {
            System.out.println(Cine);
        }

        // Sorting by Name (Comparator)
        Collections.sort(Cines, new CineNameComparator());
        System.out.println("\nCines after sorting by Name:");
        for (Cine Cine : Cines) {
            System.out.println(Cine);
        }

        // Sorting by Rating (Comparator)
        Collections.sort(Cines, new CineRatingComparator());
        System.out.println("\nCines after sorting by Rating:");
        for (Cine Cine : Cines) {
            System.out.println(Cine);
        }

        // Sorting by Year (Comparator)
        Collections.sort(Cines, new CineYearComparator());
        System.out.println("\nCines after sorting by Year:");
        for (Cine Cine : Cines) {
            System.out.println(Cine);
        }
    }
}