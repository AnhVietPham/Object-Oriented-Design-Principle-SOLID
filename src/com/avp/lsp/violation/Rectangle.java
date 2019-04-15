package com.avp.lsp.violation;

public class Rectangle {
    int mWidth;
    int mHeight;

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int mWidth) {
        this.mWidth = mWidth;
    }

    public int getHeight() {
        return mHeight;
    }

    public void setHeight(int mHeight) {
        this.mHeight = mHeight;
    }

    public int getArea(){
        return mWidth * mHeight;
    }
}
