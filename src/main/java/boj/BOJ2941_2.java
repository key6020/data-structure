package boj;

import java.util.*;

public class BOJ2941_2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        /**
         * ljes=njak    6
         * ddz=z=   3
         * nljj     3
         * c=c=     2
         * c-evapc=ic-i     9
         * cimcirastes=ams=are      17
         * ljuljamsenanjihaljki       16
         * dz=epariz=eparetud-epare     20
         * abcc-c=dd-dz=efghijklljmnnjoprss=tuvzz=dzempersljjlljnjjnnjjdzz=d-z      52
         */

        // validation check 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
        if (input.length() > 100 || !input.matches("^[a-z-=]*$")) {
            throw new Exception("Validation Failed.");
        }

        List<String> list = new ArrayList<>(Arrays.asList(input.split("")));
        int cnt = 0;

        Iterator iterator = list.iterator();
        while (iterator.hasNext() && list.size() > 1) {
            switch (list.get(0)) {
                case "c":
                    if ("=".equals(list.get(1))) {
                        cnt++;
                        list.remove("c");
                        list.remove("=");
                    } else if ("-".equals(list.get(1))) {
                        cnt++;
                        list.remove("c");
                        list.remove("-");
                    } else {
                        cnt++;
                        list.remove(0);
                    }
                    break;
                case "d":
                    if ("z".equals(list.get(1)) && "=".equals(list.get(2))) {
                        cnt++;
                        list.remove("d");
                        list.remove("z");
                        list.remove("=");
                    } else if ("-".equals(list.get(1))) {
                        cnt++;
                        list.remove("d");
                        list.remove("-");
                    } else {
                        cnt++;
                        list.remove(0);
                    }
                    break;
                case "l":
                    if ("j".equals(list.get(1))) {
                        cnt++;
                        list.remove("l");
                        list.remove("j");
                    } else {
                        cnt++;
                        list.remove(0);
                    }
                    break;
                case "n":
                    if ("j".equals(list.get(1))) {
                        cnt++;
                        list.remove("n");
                        list.remove("j");
                    } else {
                        cnt++;
                        list.remove(0);
                    }
                    break;
                case "s":
                    if ("=".equals(list.get(1))) {
                        cnt++;
                        list.remove("s");
                        list.remove("=");
                    } else {
                        cnt++;
                        list.remove(0);
                    }
                    break;
                case "z":
                    if ("=".equals(list.get(1))) {
                        cnt++;
                        list.remove("z");
                        list.remove("=");
                    } else {
                        cnt++;
                        list.remove(0);
                    }
                    break;
                default:
                    cnt++;
                    list.remove(0);
                    break;
            }
        }

        cnt += list.size();
        System.out.println(cnt);
    }
}

