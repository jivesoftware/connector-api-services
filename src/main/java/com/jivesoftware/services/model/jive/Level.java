package com.jivesoftware.services.model.jive;

import io.nodus.util.annotation.Selection;

/**
 * Created by erwolff on 4/1/15.
 */
public class Level {

    @Selection(values =  {"Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6"})
    private String description;

    private String imageURI;

    @Selection(values =  {"Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6"})
    private String name;

    private Integer points;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURI() {
        return imageURI;
    }

    public void setImageURI(String imageURI) {
        this.imageURI = imageURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
