import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;  // get last digit
            count++;     // remove last digit
        }
        System.out.println("Sum of digits = " + count);
        sc.close();
    }
}
