import java.util.Arrays;

public class IntersectionOfTwoArr {

    public static int[] intersect(int[] arr, int[] prr) {
        int i = 0, j = 0;
        int[] res = new int[Math.min(arr.length, prr.length)];
        int k = 0;

        while (i < arr.length && j < prr.length) {
            if (arr[i] < prr[j])
                i++;
            else if (prr[j] < arr[i])
                j++;

            else if (arr[i] == prr[j]) {
                res[k++] = arr[i];
                i++;
                j++;
            }
        }

        return Arrays.copyOf(res, k);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 9, 5 };
        int[] prr = { 9, 4, 9, 8, 4 };

        System.out.println(Arrays.toString(intersect(arr, prr)));
    }
}
