// Leetcode 3754

public class ConcatenateNonZero {

    public static long concate(int n){
        long x = 0;
        int sum = 0;
        long place = 1;

        while(n != 0){
            int ld = n % 10;
            if(ld != 0){
                x = x + ld * place;
                place *= 10;
                sum += ld;
            }
            n = n / 10;
        }

        return x * sum;
    }
    public static void main(String[] args) {
        int n = 102030040;
        System.out.println(concate(n));
    }
}
