import java.util.Scanner;

public class NaturalNSumOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n for Sum: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i+=2) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
