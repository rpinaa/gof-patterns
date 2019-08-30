package org.rpinaa.gof.creational.objectpool;

import javafx.geometry.Point2D;

public class Bitmap implements Image {

    private String name;
    private Point2D location;

    public Bitmap(final String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("Drawing " + this.name + " @ " + this.location);
    }

    public Point2D getLocation() {
        return this.location;
    }

    public void setLocation(Point2D location) {
        this.location = location;
    }

    public void reset() {
        this.location =  null;
    }
}
