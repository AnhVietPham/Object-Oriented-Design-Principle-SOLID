package com.avp.lsp.solution;

public abstract class Shape {
    private int height;
    private int width;

    Shape(int height, int width){
        this.width = width;
        this.height = height;
    }

    int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public abstract int area();
}
