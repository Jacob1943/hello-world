/**
 * @author Jacob
 * @date 2018/7/3
 */
public class Jewels {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        System.out.println(numJewelsInStones(J, S));

        J = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        S = "ZZ";

        System.out.println(numJewelsInStones(J, S));
    }

    public static int numJewelsInStones1(String J, String S) {

        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();

        int count = 0;

        for (char stone: stones) {

            for (char jewel: jewels) {

                if (stone == jewel) {
                    count++;
                }

            }
        }

        return count;

    }

    public static int numJewelsInStones(String J, String S) {

        int count = 0;

        if (J.length() == 0 || S.length() == 0) {
            return count;
        }

        int[] jewlelCounts = new int[58];

        for (char stone: S.toCharArray()) {
            jewlelCounts[stone - 65]++;
        }

        for (char jewel: J.toCharArray()) {

             count += jewlelCounts[jewel - 65];
        }

        return count;
    }
}
