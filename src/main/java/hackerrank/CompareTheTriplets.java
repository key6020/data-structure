package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];
        int[] result = new int[2];

        String[] tmp1 = scanner.nextLine().split(" ");
        String[] tmp2 = scanner.nextLine().split(" ");
        for (int i = 0; i < tmp1.length; i++) {
            a[i] = Integer.parseInt(tmp1[i]);
            b[i] = Integer.parseInt(tmp2[i]);

            if (a[i] > b[i]) {
                result[0] += 1;
            } else if (a[i] < b[i]) {
                result[1] += 1;
            }
        }
        System.out.println(Arrays.toString(result).substring(1).replaceFirst("]", "").replace(",", ""));
    }
}
