package hackerrank;

import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int[] result = new int[3];
        for (int a : arr) {
            if (a > 0) {
                result[0] += 1;
            } else if (a < 0) {
                result[1] += 1;
            } else {
                result[2] += 1;
            }
        }

        System.out.println(String.format("%.6f", (double) result[0] / arr.length));
        System.out.println(String.format("%.6f", (double) result[1] / arr.length));
        System.out.println(String.format("%.6f", (double) result[2] / arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
