package programmers;

public class Solutions {
    public static void main(String[] args) {
        System.out.println(solution(2, 10).toString());
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n < m) {
            answer[0] = gcd(n, m);
            answer[1] = lcm(n, m); }
        else {
            gcd(m, n);
            answer[0] = gcd(m, n);
            answer[1] = lcm(m, n);

        }
        return answer;
    }

    private static int gcd(int m, int n) {
        if(n==0) {
            return m;
        } else {
            return gcd(n, m%n);
        }
    }

    private static int lcm(int m, int n) {
        int l = gcd(m, n);
        return l*(m/l)*(n/l);
    }
}
