public class PeakElement {
    int peakEle(int arr[], int n) {
        if (n == 1)
            return arr[0]; 
        if (arr[0] >= arr[1])
            return arr[0]; 
        if (arr[n-1] >= arr[n-2])
            return arr[n-1]; 
        
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return arr[i]; 
            }
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        PeakElement peakFinder = new PeakElement();
        
        int arr[] = {10, 2, 5, 4, 3, 7, 15}; 
        int n = arr.length; 
        
        int peak = peakFinder.peakEle(arr, n); 
        
        System.out.println("Peak element is: " + peak); 
    }
}
