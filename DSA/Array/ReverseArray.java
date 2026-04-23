class Main {
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int temp = 0;
        while (start < end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        reverse(arr);
        System.out.println("Reverse Array:" );
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
