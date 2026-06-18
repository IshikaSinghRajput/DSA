import java.util.HashMap;
import java.util.HashSet;

class ContainsDuplicate {

    public static boolean contains(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]) return true;
            }
        }
        return false;
    }

    public static boolean contains2(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])) return true;
            map.put(arr[i], i);
        }
        return false;
    }

    public static boolean contains3(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,6};
        System.out.println(contains(arr));
    }
}