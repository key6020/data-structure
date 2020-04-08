package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class BOJ2588 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int A = Integer.parseInt(sc.nextLine());
//        int B = Integer.parseInt(sc.nextLine());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st1.nextToken());
        int y = Integer.parseInt(st2.nextToken());

        int[] yArr = Stream.of(String.valueOf(y).split("")).mapToInt(Integer::parseInt).toArray();

        int[] answer = new int[4];

        for(int i=yArr.length-1; i>=0; i--) {
            answer[yArr.length-i-1] = yArr[i] * x;
        }

        answer[3] = x*y;

        for(int j=0; j<answer.length; j++) {
            System.out.println(answer[j]);
        }
    }
}
