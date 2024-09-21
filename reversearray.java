public class reversearray{
    public static void reverse(int arr[], int len){
        for( int i = 0; i < len/2; i++){
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;

        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.err.print(arr[i]+" ");
        }      
    }
}
