package programmers;

import java.util.HashMap;
import java.util.Scanner;

public class LevelOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        String[] strArr = s.split("");
        HashMap<String, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < strArr.length; i++) {
            // String tmp = strArr[i];
            if (map.containsKey(strArr[i])) {
                map.put(strArr[i], map.get(strArr[i])+1);
            } else {
                map.put(strArr[i], count);
            }
        }

        if(map.get("p") == map.get("y")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


//        int num = sc.nextInt();
//
//
//        String[] tempArr = String.valueOf(num).split("");
//        int[] numArr = new int[tempArr.length];
//        for (long i = 0; i < numArr.length; i++) {
//            numArr[i] = Integer.parseInt(tempArr[i]);
//        }
//        Long.parseLong()
//
//        numArr =  IntStream.of(numArr).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
//
//        StringBuilder strNum = new StringBuilder();
//        Arrays.stream(numArr).forEachOrdered(m-> strNum.append(m));
//
//        int finalInt = Integer.parseInt(strNum.toString());
//        System.out.println(finalInt);

//        int a = 5;
//        int b = 3;
//        long ans = 0;
//
//        if(b<a) {
//            int tmp = 0;
//            tmp = a;
//            a = b;
//            b = tmp;
//        }
//        for (int i =a; i<=b; i++) {
//            ans += i;
//        }
//        System.out.println(ans);
    }
}
