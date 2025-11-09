/* Take a Number as Input, check whether the number is even or odd. */

import java.util.Scanner;

public class Que2{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int number = scanner.nextInt();
    if (number % 2 == 0) {
      System.out.print("The " + number + " is Even.");
    }
    else {
      System.out.print("The " + number + " is Odd.");
    }
    scanner.close();
  }
}