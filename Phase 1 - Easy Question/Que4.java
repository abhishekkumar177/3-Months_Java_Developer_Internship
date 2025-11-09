/*Check whether a number is divisible by 5 and 3 bothor not*/

import java.util.Scanner;

public class Que3{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int number = scanner.nextInt();
    if (number % 5 == 0) && (number %3 == 0) {
      System.out.print("The number " + number + " is divisible by 5 and 3.");
    }
    else {
      System.out.print("The number " + number + " is not divisible by 5 and 3.");
    }
    scanner.close();
  }
}
