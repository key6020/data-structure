package leetcode;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
        System.out.println(arrangeCoins(2));
        System.out.println(arrangeCoins(3));
        System.out.println(arrangeCoins(4));
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(6));
        System.out.println(arrangeCoins(7));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(9));
        System.out.println(arrangeCoins(10));
    }

    public static int arrangeCoins(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        if (n <= 3) {
//            return 2;
//        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            n = n - i;
            result += 1;
        }

        return result;
    }
}
