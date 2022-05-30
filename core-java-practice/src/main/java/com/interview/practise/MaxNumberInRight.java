package com.interview.practise;

public class MaxNumberInRight {

    public static void main(String sr[]) {
        int[] ar = {1, 3, 5, 2, 8, 6, 7};
        System.out.println(sencond(ar));
    }

    static int sencond(int[] ar) {
        int s = Integer.MIN_VALUE;
        int l = Integer.MIN_VALUE;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > l) {
                s = l;
                l = ar[i];
            } else if (ar[i] > s) {
                s = ar[i];
            }
        }

        return s;
    }
}
