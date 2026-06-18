import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZero {

    public static int[] zero(int[] arr){
        int res[] = new int[arr.length];
        int k = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) res[k++] = arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 0, 3 };
        System.out.println(Arrays.toString(zero(arr)));
    }
}
