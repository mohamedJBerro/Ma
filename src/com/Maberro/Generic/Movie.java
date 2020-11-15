package com.Maberro.Generic;

import java.util.Comparator;

public class Movie {
    private String title;
    private int like;
    public Movie(String name, int like) {
        this.title = name;
        this.like = like;
    }
    public int getLike() {
        return like;
    }
    public String getTitle() {
        return title;
    }
//  @Override
//   public int compareTo(Movie o) {
//       return this.like-o.like;
//   }
}
