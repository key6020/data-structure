package programmers;

import java.util.Arrays;

public class LevelTwo {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        int[] arr1 = {1, 4, 2};
//        int[] arr2 = {5, 4, 4};

        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i] * arr2[arr2.length - i - 1];
        }
        System.out.println(sum);

    }
}
