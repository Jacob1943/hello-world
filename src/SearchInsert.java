/**
 * @author Jacob
 * @date 2018/7/19
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        int s = 0, e = nums.length - 1;

        while(s <= e) {

            int mid = (s + e) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target) {
                s = mid + 1;
            }
            if(nums[mid] > target) {
                e = mid - 1;
            }

        }

        return s;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        System.out.println(new SearchInsert().searchInsert(nums, 7));
    }
}
