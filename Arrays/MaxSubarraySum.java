public class MaxSubarraySum {

    public static int sum(int[] arr){
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            currSum = Math.max(currSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    } 

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(sum(arr));
    }
}
