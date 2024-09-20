import java.util.Arrays;
public class MinMaxEle{
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7, 10, 14, 56, 3, 1};
        Arrays.sort(arr);
        System.err.println("Min: "+arr[0]+" Max: "+arr[arr.length-1]);
        
    }
}