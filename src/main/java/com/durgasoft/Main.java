package com.durgasoft;

import com.durgasoft.beans.Album;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Album album = (Album) applicationContext.getBean("album");
        album.getAlbumDetails();
    }
}