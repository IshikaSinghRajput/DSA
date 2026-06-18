import java.util.Arrays;

public class MergeSortedArr {

    public static void merge(int[] arr, int[] prr, int m, int n){
        int idx = m+n-1;
        int i = m-1;
        int j = n-1;

        while(i >= 0 && j >= 0){
           if(arr[i] > prr[j]){
            arr[idx--] = arr[i--];
           }
           else{
            arr[idx--] = prr[j--];
           }
        }

        while(j >= 0){
            arr[idx--] = prr[j--];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0, 0, 0 };
        int[] prr = { 2, 5, 6 };
        int m = 3, n = 3;

        merge(arr, prr, m, n);

        System.out.println(Arrays.toString(arr));
    }
}