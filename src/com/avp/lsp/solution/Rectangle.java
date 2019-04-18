package com.avp.lsp.solution;

public class Rectangle extends Shape {


    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public int area() {
        return this.getWidth() * this.getHeight();
    }
}
