package com.practice.ratingsdataservice;

public class Rating {
    public String movieId;
    public int rating;

    public Rating(String movieId, int i) {
        this.movieId = movieId;
        this.rating = i;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
