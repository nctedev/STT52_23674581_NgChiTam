/**
 * @description:
 * @author: Tam, Nguyen Chi Tam
 * @version: 1.0
 * @created: 8/21/2024
 */

package edu.iuh.fit.exer2;

import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Set the width of the rectangle");
        r1.setLength(4);
        System.out.println("Done!");
        System.out.println("The length of the rectangle is: " + r1.getLength());
        System.out.println("Set the length of the rectangle");
        r1.setWidth(5);
        System.out.println("Done!");
        System.out.println("The width of the rectangle is: " + r1.getWidth());
        System.out.println("The area of the rectangle is: " + r1.getArea());
        System.out.println("The perimeter of the rectangle is: " + r1.getPerimeter());
        System.out.println("Display the rectangle");
        System.out.println(r1.toString());
    }
}
