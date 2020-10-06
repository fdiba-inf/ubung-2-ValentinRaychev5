package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int radius = input.nextInt();
      double Area = (Math.PI * radius * radius);
      double Circumference = (Math.PI * radius * 2);

      System.out.println("Circumference: " + Circumference);
      System.out.println("Area: " + Area);
    }

}
