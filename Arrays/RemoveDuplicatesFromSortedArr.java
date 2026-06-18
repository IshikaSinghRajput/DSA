
public class RemoveDuplicatesFromSortedArr {

    public static int removeDuplicates(int[] arr) {
        int idx = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 14, 5, 15 };
        int k = removeDuplicates(arr);

        for(int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
