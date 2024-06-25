package com.cinesort.comparable;

//movie class implementing Comparable interface
public class Movie implements Comparable<Movie> {
	
	private String movieName;
	private int movieId;
	private double movieRating;
	private int movieYear;
	
	public Movie(String movieName, int movieId, double movieRating, int movieYear) {
		super();
		this.movieName = movieName;
		this.movieId = movieId;
		this.movieRating = movieRating;
		this.movieYear = movieYear;
	}
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}
	
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieId=" + movieId + ", movieRating=" + movieRating
				+ ", movieYear=" + movieYear + "]";
	}

	//sort by movieID
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.movieId,o.movieId);
	}

	

}
