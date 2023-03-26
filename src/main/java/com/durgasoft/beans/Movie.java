package com.durgasoft.beans;

public class Movie {
    private String id;
    private String name;
    private String rating;

    public Movie(String id, String name, String rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public void getMovieDetails()

    {
        System.out.println("Movie Details");
        System.out.println("--------------------");
        System.out.println("Movie Id    :"+id);
        System.out.println("Movie Name  :"+name);
        System.out.println("Movie Rating:"+rating);
    }
}
