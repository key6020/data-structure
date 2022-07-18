package boj;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class BOJ10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        log.info(solve(br.readLine()) + "");
    }

    public static int solve(String input) {
        if (input.equals(new StringBuilder(input).reverse().toString())) {
            return 1;
        }
        return 0;
    }
}
