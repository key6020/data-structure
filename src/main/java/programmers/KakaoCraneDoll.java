package programmers;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class KakaoCraneDoll {
    public static void main(String[] args) {
        log.info(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4}) + "");
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int index = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][index] != 0) {
                    int temp = board[j][index];
                    board[j][index] = 0;
                    if (!stack.isEmpty() && temp == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
