package exercise2;

import java.util.Scanner;

public class DayOfWeek  {

    public static void main (String[] args) {

      Scanner input = new Scanner(System.in);

      int DayNumber = input.nextInt();
//Day of week: 
      if(DayNumber == 1) {
        System.out.println("Day of week: Monday"); 
      }
      else if(DayNumber == 2) {
        System.out.println("Day of week: Tuesday"); 
      }
      else if(DayNumber == 3) {
        System.out.println("Day of week: Wednesday"); 
      }
      else if(DayNumber == 4) {
        System.out.println("Day of week: Thursday"); 
      }
      else if(DayNumber == 5) {
        System.out.println("Day of week: Friday"); 
      }
      else if(DayNumber == 6) {
        System.out.println("Day of week: Saturday"); 
      }
      else if(DayNumber == 7) {
        System.out.println("Day of week: Sunday"); 
      }
      else{
        System.out.println("Invalid day"); 
      }

    }
}