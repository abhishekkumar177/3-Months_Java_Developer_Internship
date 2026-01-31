import java.util.Scanner;
public class SumDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;  // get last digit
            n = n / 10;     // remove last digit
        }
        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}
