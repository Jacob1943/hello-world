/**
 * @author Jacob
 * @date 2018/7/2
 */
public class Delta {

    public static void main(String[] args) {

        int row = 100;
        printDelta(row);
    }

    static void printDelta(int row) {
        for (int y = row; y > 0; y--) {
            for (int x = 1; x <= row; x++) {
                if (x < y) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            for (int x = 1; x <= row; x++) {
                if (x > y) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
