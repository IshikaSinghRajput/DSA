import java.util.*;

class MissingNumber {

    public static int missing(int[] arr) {
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }

        for (int i = 0; i <= arr.length; i++) {
            xor ^= i;
        }

        return xor;

    }

    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missing(arr));
    }
}