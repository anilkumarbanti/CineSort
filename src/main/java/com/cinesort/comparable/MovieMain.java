package com.cinesort.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileReader fileReader=new FileReader("movies.json");
		List<Movie> movies=new ArrayList<>();
		
		//Read JSON file
		
		try(BufferedReader reader=new BufferedReader(new FileReader("movies.json"))){
			System.out.println(">>>> Inside try block <<<<<<");
			
			
			StringBuilder jsonContent=new StringBuilder();
			String line;
			
			while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
			
			JSONArray jsonArray=new JSONArray(jsonContent.toString());
			
			//Parse JSON data and create Movie Objects
			System.out.println(">>>> Parsing data <<<<<<");
			for(int i=0;i<jsonArray.length();i++)
			{
				JSONObject jsonObject=jsonArray.getJSONObject(i);
				String movieName=jsonObject.getString("movieName");
				int movieId=jsonObject.getInt("movieId");
				double movieRating=jsonObject.getDouble("movieRating");
				int movieYear=jsonObject.getInt("movieYear");
				movies.add(new Movie(movieName, movieId, movieRating, movieYear));
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		//original list of movies
		
		System.out.println("movies before sorting byID:");
		for(Movie movie:movies)
		{
			System.out.println(movie);
		}
		
		//Sorting by ID(Comparable)
		
		Collections.sort(movies);
		
		System.out.println("movies after sorting byID:");
		for(Movie movie:movies)
		{
			System.out.println(movie);
		}
		
		

	}

}
