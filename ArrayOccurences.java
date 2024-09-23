public class ArrayOccurences{
    static int Occurences(int arr[], int n, int x){
        int res = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]==x)
                res++;
        }
        return res;
    } 

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 2, 2, 4};
        int n = arr.length;
        int x = 2;
        System.out.println(Occurences(arr, n, x));
    }
}