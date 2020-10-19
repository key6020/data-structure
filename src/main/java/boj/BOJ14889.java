package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.jar.JarOutputStream;

public class BOJ14889 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        List<Integer> list = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < n; i++) {
            list.add(num++);
        }

        int t1 = 0;
        int t2 = 0;
        int diff = 0;

        for (int l = 0; l < list.size(); l++) {
            for (int m = 0; m < list.size(); m++) {
                if (l != m) {
                    t1 = arr[list.get(l)][list.get(m)] + arr[list.get(m)][list.get(l)];
                    System.out.println("l : " + l + " " + "m : " + m);
                    System.out.println("for t1 - list.get(l) : " + list.get(l) + " " + "list.get(m) : " + list.get(m));
                    list.remove(list.get(l));
                    list.remove(list.get(m));
                    System.out.println("l : " + l + " " + "m : " + m);
                    System.out.println("for t2  - list.get(l) : " + list.get(l) + " " + "list.get(m) : " + list.get(m));
                    t2 = arr[list.get(l)][list.get(m)] + arr[list.get(m)][list.get(l)];
                    System.out.println("t1 : " + t1 + " " + "t2 : " + t2);
                }
            }
        }


//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i != j) {
//                    t1 = arr[i][j] + arr[j][i];
//                    list.remove(i);
//                    list.remove(j);
//                    System.out.println("t1 : " + t1);
//                }
//            }
//        }
//        for (int a = 0; a < list.size(); a++) {
//            t2 = arr[list.get(a)][list.get(a + 1)] + arr[list.get(a + 1)][list.get(a)];
//            System.out.println("t2 : " + t2);
//        }

        int abs = Math.abs(t1 - t2);
        if (abs <= diff) {
            diff = abs;
        }
        System.out.println(diff);
    }

}
