import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reverse = 0;
        int temp = Math.abs(n); // handle negative numbers
        while (temp > 0) {
            int digit = temp % 10;              // get last digit
            reverse = reverse * 10 + digit;     // build reverse
            temp = temp / 10;                   // remove last digit
        }
        if (n < 0) reverse = -reverse;
        System.out.println("Reversed number = " + reverse);
        sc.close();
    }
}
