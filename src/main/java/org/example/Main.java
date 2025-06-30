package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Area of circle formula
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }

    // Area of triangle formula
    public static double calculateTriangleArea(double base, double height) {
        return 1/2.0 * base * height;
    }

    // Area of rectangle formula
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");

        Scanner sc = new Scanner(System.in);
        // Get user choice
        int shape = sc.nextInt();
        System.out.println();

        // Calculate area of shape based on user choice
        switch (shape) {
            case 1: {
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
                System.out.printf("Area of the circle: %.2f" , calculateCircleArea(radius));
                break;
            }
            case 2: {
                System.out.print("Enter the base: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height: ");
                double height = sc.nextDouble();
                System.out.printf("Area of the triangle: %.2f" , calculateTriangleArea(base, height));
                break;
            }
            case 3: {
                System.out.print("Enter the length: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width: ");
                double width = sc.nextDouble();
                System.out.printf("Area of the rectangle: %.2f" , calculateRectangleArea(length, width));
                break;
            }
        }

    }
}