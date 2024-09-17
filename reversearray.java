public class reversearray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); 
        }
    }

    public static void reverse(int array[], int len) {
        for (int i = 0; i < len / 2; ++i) {
            int temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }
    }
}
