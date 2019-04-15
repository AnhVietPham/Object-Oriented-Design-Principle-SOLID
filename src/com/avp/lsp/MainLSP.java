package com.avp.lsp;

import com.avp.lsp.violation.Rectangle;
import com.avp.lsp.violation.Square;

public class MainLSP {

    private static Rectangle getNewRectangle(){
        return new Square();
    }

    public static void main(String args[]){
        Rectangle rectangle = MainLSP.getNewRectangle();

        rectangle.setWidth(5);
        System.out.println(rectangle.getArea());

        rectangle.setHeight(10);
        System.out.println(rectangle.getArea());
    }
}
