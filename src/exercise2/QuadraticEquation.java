package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        double x1 = 0.0;
        double x2 = 0.0;
        if(a != 0.0)  {

          double D = b*b - 4.0*a*c;

          if(D >= 0.0)  {
            x1 = ((-b) + Math.sqrt(D)) / (2.0*a); 
            x2 = ((-b) - Math.sqrt(D)) / (2.0*a);

            System.out.println(x1 + ", " + x2);
          }
          else  {
            System.out.println("Imaginary values");
          }
        }
        else  {//a=0
          if(b != 0.0)  {
            x1 = -(c/b);
            System.out.println("x: " + x1);
          }
          else  {//b=0
            if(c != 0)  {
              System.out.println("No values");
            }
            else  {
              System.out.println("Many values");
            }
          }
        }
    }

}