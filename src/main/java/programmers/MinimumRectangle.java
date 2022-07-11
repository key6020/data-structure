package programmers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MinimumRectangle {
    public static void main(String[] args) {
        log.info(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}) + "");
        log.info(solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}) + "");
        log.info(solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}) + "");
    }

    // 완전탐색
    public static int solution(int[][] sizes) {
        int length = sizes.length;
        int width = 0;
        int height = 0;
        for (int i = 0; i < length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            width = Math.max(width, sizes[i][0]);
            height = Math.max(height, sizes[i][1]);
        }

        return width * height;
    }
}
