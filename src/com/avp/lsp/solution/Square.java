package com.avp.lsp.solution;

public class Square extends Shape {

    public Square(int height) {
        super(height, height);
    }

    @Override
    public int area() {
        return this.getWidth() * this.getHeight();
    }
}
