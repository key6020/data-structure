package boj;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class BOJ1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        log.info(solve(br.readLine()) + "");
    }

    public static int solve(String input) {
        if (input.equals(new StringBuilder(input).reverse().toString())) {
            return input.length();
        }
        for (int i = 0; i < input.length(); i++) {
            StringBuilder sb = new StringBuilder(input);
            sb.append(new StringBuilder(input.substring(0, i)).reverse());
            if (sb.toString().equals(sb.reverse().toString())) {
                return sb.length();
            }
        }
        return -1;
    }
}
