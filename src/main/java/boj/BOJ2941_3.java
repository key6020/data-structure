package boj;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class BOJ2941_3 {

    private static int INPUT_MAX_LENGTH = 100;
    private static Pattern INPUT_VALID_PATTERN = Pattern.compile("([a-z=]|-)+");
    private static String EXTRA_WORD = "dz=";
    private static String[] BASIC_WORDS = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
    private static Set<String> BASIC_WORD_SET = Arrays.asList(BASIC_WORDS).stream().collect(Collectors.toSet());

    public static void main(String[] args) throws Exception {
        //BOJ2941
//        Map<String, Integer> map = new HashMap<>();
//        map.put("ljes=njak", 6);
//        map.put("ddz=z=", 3);
//        map.put("nljj", 3);
//        map.put("c=c=", 2);
//        map.put("c-evapc=ic-i", 9);
//        map.put("cimcirastes=ams=are", 17);
//        map.put("ljuljamsenanjihaljki", 16);
//        map.put("dz=epariz=eparetud-epare", 20);
//        map.put("abcc-c=dd-dz=efghijklljmnnjoprss=tuvzz=dzempersljjlljnjjnnjjdzz=d-z", 52);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        if(!isValid(input)) {
            throw new Exception("Validation Failed.");
        }

        System.out.println(cal(input));

//        map.entrySet().stream().forEach(x -> {
//            assert x.getKey() != null && x.getKey().length() > 0;
//            assert x.getKey().length() <= INPUT_MAX_LENGTH;
//            if (!isValid(x.getKey())) {
//                System.err.println("invalid");
//                return;
//            }
//            int count = cal(x.getKey());
//            if (count != x.getValue()) {
//                System.out.println(String.format("%s count is not  %d", x.getKey(), x.getValue()));
//            } else {
//                System.out.println(String.format("%s count : %d", x.getKey(), x.getValue()));
//            }
//        });
    }

    private static boolean isValid(String input) {
        if(input == null || input.length()>100 || input.length() == 0) {
            return false;
        }

        return INPUT_VALID_PATTERN.matcher(input).find();
    }

    private static int cal(String input) {
        String[] params = input.split("");
        int len = params.length;
        if (len == 1) {
            return 1;
        } else if (len == 2) {
            return BASIC_WORD_SET.contains(input) ? 1 : 2;
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (i + 1 < len) {
                String basicWord = new StringBuilder(params[i]).append(params[i + 1]).toString();
                if (BASIC_WORD_SET.contains(basicWord)) {
                    count++;
                    i += 1;
                } else {
                    if (i + 2 < len) {
                        String extraWord = new StringBuilder(basicWord).append(params[i + 2]).toString();
                        if (EXTRA_WORD.equals(extraWord)) {
                            count++;
                            i += 2;
                        } else {
                            count++;
                        }
                    } else {
                        count++;
                    }
                }
            } else {
                count++;
            }
        }
        return count;
    }
}