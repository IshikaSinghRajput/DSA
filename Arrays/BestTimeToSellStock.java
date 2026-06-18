class BestTimeToSellStock{

    public static int profit(int[] arr){
        int minBuy = arr[0];
        int profit = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minBuy){
                minBuy = arr[i];
            }
            else if(arr[i] - minBuy > profit){
                    profit = arr[i] - minBuy;
                }
        }

        return profit;
    }

    public static void main(String[] args){
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(profit(arr));
    }
}