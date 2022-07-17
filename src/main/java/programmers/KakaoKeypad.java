package programmers;

public class KakaoKeypad {
    public static void main(String[] args) {
        // LRLLLRLLRRL
        System.out.println(solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        // LRLLRRLLLRR
        System.out.println(solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        // LLRLLRLLRL
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        Position left = new Position(3, 0);
        Position right = new Position(3, 2);
        Position numPos;
        for (int num : numbers) {
            numPos = getNumberPosition(num);
            String finger = getFinger(hand, left, right, numPos);

            sb.append(finger);
            if (finger.equals("L")) {
                left = numPos;
            } else {
                right = numPos;
            }
        }

        return sb.toString();
    }

    private static String getFinger(String hand, Position left, Position right, Position numPos) {
        String finger = hand.equals("right") ? "R" : "L";
        if (numPos.col == 0) {
            finger = "L";
        } else if (numPos.col == 2) {
            finger = "R";
        } else {
            int leftDistance = Math.abs(left.row - numPos.row) + Math.abs(left.col - numPos.col);
            int rightDistance = Math.abs(right.row - numPos.row) + Math.abs(right.col - numPos.col);

            if (leftDistance < rightDistance) {
                finger = "L";
            } else if (rightDistance < leftDistance) {
                finger = "R";
            }
        }

        return finger;
    }

    private static Position getNumberPosition(int num) {
        Position numPos = null;
        switch (num) {
            case 0:
                numPos = new Position(3, 1);
                break;
            case 1:
                numPos = new Position(0, 0);
                break;
            case 2:
                numPos = new Position(0, 1);
                break;
            case 3:
                numPos = new Position(0, 2);
                break;
            case 4:
                numPos = new Position(1, 0);
                break;
            case 5:
                numPos = new Position(1, 1);
                break;
            case 6:
                numPos = new Position(1, 2);
                break;
            case 7:
                numPos = new Position(2, 0);
                break;
            case 8:
                numPos = new Position(2, 1);
                break;
            case 9:
                numPos = new Position(2, 2);
                break;
        }
        return numPos;
    }

    static class Position {
        int row;
        int col;

        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
