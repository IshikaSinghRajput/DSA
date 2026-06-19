import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] square(int[] arr){
        int[] res = new int[arr.length];
        int k = 0;

        for(int i = 0; i < arr.length; i++){
            res[k++] = arr[i] * arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(square(arr)));
    }
}
