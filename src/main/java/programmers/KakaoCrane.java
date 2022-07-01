package programmers;

import java.util.Stack;

public class KakaoCrane {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }

    public static int solution(int[][] board, int[] moves) {
        for (int m = 0; m < moves.length; m++) {
            moves[m] = moves[m] - 1;
        }

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int m = 0; m < moves.length; m++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][moves[m]] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[i][moves[m]]);
                    } else {
                        if (board[i][moves[m]] == stack.peek()) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(board[i][moves[m]]);
                        }
                    }
                    board[i][moves[m]] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
