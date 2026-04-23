import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i <arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum:" + max);
        for(int i = 0; i <arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum:" + min);
        sc.close();
    }
}
