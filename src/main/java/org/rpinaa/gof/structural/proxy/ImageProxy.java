package org.rpinaa.gof.structural.proxy;

import javafx.geometry.Point2D;

public class ImageProxy implements Image {

    private String name;
    private Bitmap bitmap;
    private Point2D location;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point2D) {

        if (this.bitmap != null) {
            this.bitmap.setLocation(point2D);
        } else {
            location = point2D;
        }
    }

    @Override
    public Point2D getLocation() {

        if (this.bitmap != null) {
            return this.bitmap.getLocation();
        }

        return this.location;
    }

    @Override
    public void render() {

        if (this.bitmap == null) {
            this.bitmap = new Bitmap(this.name);

            if (this.location != null) {
                this.bitmap.setLocation(this.location);
            }
        }

        this.bitmap.reset();
    }
}
