/**
 * @author Jacob
 * @date 2018/7/10
 */
public class ReverseInteger {

//    public int reverse(int x) {
//
//        int result = 0;
//
//        if (x == Integer.MIN_VALUE) {
//            return result;
//        }
//
//        char[] arr = String.valueOf(Math.abs(x)).toCharArray();
//
//        int i = 0, j = arr.length - 1;
//
//        while(i != j && i != j + 1) {
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            i++;
//            j--;
//        }
//
//        String str = String.valueOf(arr);
//
//        long longValue = Long.valueOf(str);
//
//        if (longValue <= Integer.MAX_VALUE && longValue >= Integer.MIN_VALUE) {
//            result = (int)longValue;
//        }
//
//        return x < 0 ? -result : result;
//    }

    public static void main(String[] args) {

        System.out.println(new ReverseInteger().reverse(1234567899));
    }


    public int reverse(int x) {

        int rev = 0;

        while(x != 0) {

            int pop = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
        }

        return rev;
    }
}
