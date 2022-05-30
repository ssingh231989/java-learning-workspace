package com.interview.practise;

public class StringAdd {

    public static void main(String arp[]) {
        String s = "1+2+3-4";
        int sum = 0;

        for (int i = 0; i <s.length(); i = i + 2) {
            char prev='0';
            if (s.length() > 1 && i>0) {
                prev = s.charAt(i - 1);
            }

            if (prev == '+') {
                sum += Integer.valueOf(s.charAt(i)+"");
            } else if (prev == '-') {
                sum -= Integer.valueOf(s.charAt(i)+"");
            } else {
                sum += Integer.valueOf(s.charAt(i)+"");
            }
        }
        System.out.println(sum);
    }

}
