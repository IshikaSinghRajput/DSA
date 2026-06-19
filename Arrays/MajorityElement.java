import java.util.HashMap;

public class MajorityElement {

    public static int majority(int[] arr){
        int candid = 0;
        int count = 0;

        for(int num : arr){
            if(count == 0) candid = num;

            if(num == candid) count++;
            else count--;
        }
        return candid;
    }

    public static int majority2(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length / 2;
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > n) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majority(arr));
        System.out.println(majority2(arr));
    }
}