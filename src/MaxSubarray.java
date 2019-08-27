/**
 * @author Jacob
 * @date 2018/7/19
 */
public class MaxSubarray {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4,-1, 2, 1, -5, 4};

        System.out.println(new MaxSubarray().maxSubArray(arr));
    }

//    public int maxSubArray(int[] nums) {
//
//        int max = nums[0];
//        int sum = 0;
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i; j < nums.length; j++) {
//
//                sum += nums[j];
//                max = max >= sum ? max: sum;
//            }
//
//            sum = 0;
//        }
//
//        return max;
//    }

    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int sum = nums[0];


        for (int i = 1; i < nums.length; i++) {


            sum = sum + nums[i] > nums[i] ? sum + nums[i] : nums[i];
            max = max > sum ? max: sum;
        }

        return max;
    }
}
