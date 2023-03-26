package com.durgasoft.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Album {
    private String albumId;
    private String albumName;
    private Movie movie;

    public Album(String albumId, String albumName, @Autowired @Qualifier("bahubali") Movie movie) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.movie = movie;
    }

    public void getAlbumDetails(){
        System.out.println("Album Details");
        System.out.println("--------------------");
        System.out.println("Album Id    :"+albumId);
        System.out.println("Album Name  :"+albumName);
        movie.getMovieDetails();
    }
}
