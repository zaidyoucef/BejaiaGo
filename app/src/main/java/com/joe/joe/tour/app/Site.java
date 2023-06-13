package com.joe.joe.tour.app;

public class Site {
    private final String name;
    private final String details;
    private final int imageId;
    private static final int NO_IMAGE = -1;


    public Site(String name, int image, String details) {
        this.name = name;
        this.details = details;
        imageId = image;
    }

    public String getName() {
        return name;
    }


    public int getImageId() {
        return imageId;
    }

    public boolean hasImage() {
        return imageId != NO_IMAGE;
    }

    public String getDetails() {
        return details;
    }
}
