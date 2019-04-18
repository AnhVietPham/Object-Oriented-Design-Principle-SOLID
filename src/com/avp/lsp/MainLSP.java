package com.avp.lsp;

import com.avp.lsp.solution.Rectangle;
import com.avp.lsp.solution.Shape;
import com.avp.lsp.solution.Square;



public class MainLSP {

//    private static Rectangle getNewRectangle(){
//        return new Square();
//    }

    public static void main(String args[]){

        /**
         * LSP violation
         * */
//        Rectangle rectangle = MainLSP.getNewRectangle();
//
//        rectangle.setWidth(5);
//        System.out.println(rectangle.getArea());
//
//        rectangle.setHeight(10);
//        System.out.println(rectangle.getArea());

           /**
            * Good
            * */

        Shape square = new Square(5);
        System.out.println("Square's area is : " + square.area());
        Shape rectangle = new Rectangle(10,5);
        System.out.println("Rectangle's area is : " + rectangle.area());
    }
}
