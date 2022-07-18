package boj;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class BOJ8892 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String[] answerArr = new String[tc];
        for (int i = 0; i < tc; i++) {
            int length = Integer.parseInt(br.readLine());
            String[] strArr = new String[length];
            for (int j = 0; j < length; j++) {
                strArr[j] = br.readLine();
            }
            answerArr[i] = solve(strArr);
        }

        for (int a = 0; a < answerArr.length; a++) {
            log.info(answerArr[a]);
        }
    }

    public static String solve(String[] inputArr) {
        String answer = "0";
        for (int i = 0; i < inputArr.length; i++) {
            StringBuilder sb = new StringBuilder(inputArr[i]);
            for (int j = 1; j < inputArr.length; j++) {
                sb.append(inputArr[j]);

                if (sb.toString().equals(sb.reverse().toString())) {
                    answer = sb.toString();
                    break;
                }
            }
        }
        return answer;
    }
}
