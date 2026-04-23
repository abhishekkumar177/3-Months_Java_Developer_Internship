class Main {
    public static void main(String[] args) {
        int[] arr = {10,56,26,72,11,56,7};
        
        boolean isSorted = true;

        for(int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i - 1]){
                isSorted = false;
                break;
            }
        }

        if (isSorted){
            System.out.println("Array is sorted !!");
        } else {
            System.out.println("Array is not sorted !!");
        }
    }
}
