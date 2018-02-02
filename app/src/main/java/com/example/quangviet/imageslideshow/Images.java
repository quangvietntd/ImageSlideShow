package com.example.quangviet.imageslideshow;

/**
 * Created by QUANGVIET on 02-Feb-18.
 */

public class Images {
    int id;
    String description;

    public Images(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
