package com.Shawn;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by Wolfknightx on 3/29/2016.
 */
public class Snake {
    String species;
    int venomRating;

    public Snake(String s, int v){
        this.species = s;
        this.venomRating = v;
    }

    public int compare(Snake other){//this compares based on the name of the snake against itself.
        if (venomRating == other.venomRating){
            return species.toLowerCase().compareTo(other.species.toLowerCase());
        }else {
            return other.venomRating-venomRating;
        }
    }

    public void printSnakeInfo(){
        System.out.println(species + ", " +venomRating);
    }
}
