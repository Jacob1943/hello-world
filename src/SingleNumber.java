import java.util.HashMap;
import java.util.Map;

/**
 * @author Jacob
 * @date 2018/7/5
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 1, 2, 3, 2, 2};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {

            if (entry.getValue() == 1) {

                return entry.getKey();
            }
        }

        return nums[0];

    }


//    public static int singleNumber(int[] A) {
//        int ones = 0, twos = 0;
//        for(int i = 0; i < A.length; i++){
//            ones = (ones ^ A[i]) & ~twos;
//            twos = (twos ^ A[i]) & ~ones;
//        }
//        return ones;
//    }


}
