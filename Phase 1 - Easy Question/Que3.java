/*Check whether a number is divisible by 5 or not*/

import java.util.Scanner;

public class Que3{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int number = Scanner.nextINT();
    if (number % 5 ==0) {
      System.out.print("The number" + number + "is divisible by 5.");
    }
    else {
      System.out.print("The number" + number + "is not divisible by 5.");
    }
    scanner.close();
  }
}
