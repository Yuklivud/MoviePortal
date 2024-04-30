package com.movieportal.utils;

public class Film {
    private String title;
    private String genre;
    private String year;
    private double rating;
    private String description;

    public Film(String title, String genre, String year, double rating, String description) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }
}
