package programmers;

import java.util.HashMap;

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
        HashMap<String, Integer> distanceMap = new HashMap<>();
        distanceMap.put("12", 1);
        distanceMap.put("45", 1);
        distanceMap.put("78", 1);
        distanceMap.put("23", 1);
        distanceMap.put("56", 1);
        distanceMap.put("89", 1);
        distanceMap.put("*0", 1);
        distanceMap.put("#0", 1);
        distanceMap.put("25", 1);
        distanceMap.put("58", 1);
        distanceMap.put("08", 1);
        distanceMap.put("15", 2);
        distanceMap.put("24", 2);
        distanceMap.put("57", 2);
        distanceMap.put("48", 2);
        distanceMap.put("07", 2);
        distanceMap.put("35", 2);
        distanceMap.put("26", 2);
        distanceMap.put("59", 2);
        distanceMap.put("68", 2);
        distanceMap.put("09", 2);
        distanceMap.put("*8", 2);
        distanceMap.put("#8", 2);
        distanceMap.put("05", 2);
        distanceMap.put("28", 2);
        distanceMap.put("18", 3);
        distanceMap.put("04", 3);
        distanceMap.put("27", 3);
        distanceMap.put("38", 3);
        distanceMap.put("06", 3);
        distanceMap.put("29", 3);
        distanceMap.put("*5", 3);
        distanceMap.put("#5", 3);
        distanceMap.put("02", 3);
        distanceMap.put("01", 4);
        distanceMap.put("03", 4);
        distanceMap.put("*2", 4);
        distanceMap.put("#2", 4);

        StringBuilder sb = new StringBuilder();

        String currentLeft = "*";
        String currentRight = "#";
        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                currentLeft = String.valueOf(n);
                sb.append("L");
            }
            if (n == 3 || n == 6 || n == 9) {
                currentRight = String.valueOf(n);
                sb.append("R");
            }
            if (n == 2 || n == 5 || n == 8 || n == 0) {
                String diffLeft;
                String diffRight;
                if (currentLeft.equals("*")) {
                    diffLeft = currentLeft + n;
                } else {
                    diffLeft = Integer.parseInt(currentLeft) > n ? n + currentLeft : currentLeft + n;
                }
                if (currentRight.equals("#")) {
                    diffRight = currentRight + n;
                } else {
                    diffRight = Integer.parseInt(currentRight) > n ? n + currentRight : currentRight + n;
                }
                if (distanceMap.get(diffLeft).equals(distanceMap.get(diffRight))) {
                    if (hand.equalsIgnoreCase("right")) {
                        currentRight = String.valueOf(n);
                        sb.append("R");
                    }
                    if (hand.equalsIgnoreCase("left")) {
                        currentLeft = String.valueOf(n);
                        sb.append("L");
                    }
                }
                if (distanceMap.get(diffLeft) > distanceMap.get(diffRight)) {
                    currentRight = String.valueOf(n);
                    sb.append("R");
                }
                if (distanceMap.get(diffRight) > distanceMap.get(diffLeft)) {
                    currentLeft = String.valueOf(n);
                    sb.append("L");
                }
            }
        }
        return sb.toString();
    }
}
