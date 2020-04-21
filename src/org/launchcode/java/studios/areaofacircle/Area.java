package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        if (radius < 0){
            System.out.println("Radius can't be a negative number");
        }

        input.close();

        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius +"is: " + area);

    }
}
