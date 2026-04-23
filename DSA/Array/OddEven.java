class Main {
    public static void main(String[] args) {
        int[] arr = {15,7,8,6,9,3,5,4};
        int oddCount = 0;
        int evenCount = 0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Odd Numbers:" + oddCount);
        System.out.println("Even Numbers:" + evenCount);
    }
}
