// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("array is: \n[ ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        
        
    }
}