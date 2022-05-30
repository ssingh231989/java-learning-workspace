package com.interview.practise;

import java.util.HashMap;
import java.util.Map;

public class SubStringCount {

    public static void main(String ar[]) {

        //System.out.println(countFrequency("dhimanman","man"));
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("Chennai", "Banglore");
        stringStringMap.put("Bombay", "Delhi");
        stringStringMap.put("Goa", "Chennai");
        stringStringMap.put("Delhi", "Goa");
        //printResult(stringStringMap);
        int a[] = {3, 9,4,6,7,5,10};
        printMaxNumber(a);
    }

    static int countFrequency(String patt, String txt) {
        int m = patt.length();
        int n = txt.length();
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = patt.indexOf(txt, lastIndex);
            if (lastIndex != -1) {
                lastIndex += txt.length();
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    static void printResult(Map<String, String> dataset) {

        Map<String, String> rev = new HashMap<>();
        for (Map.Entry<String, String> mp : dataset.entrySet()) {
            rev.put(mp.getValue(), mp.getKey());

        }
        String starting = null;

        for (Map.Entry<String, String> entry : dataset.entrySet()) {
            String key = entry.getKey();
            if (!rev.containsKey(key)) {
                starting = key;
                break;
            }
        }

        if (starting == null) {
            System.out.println("invalid path");
        }

        String to = dataset.get(starting);

        while (to != null) {
            System.out.println(starting + "->" + to);
            starting = to;
            to = dataset.get(to);
        }
    }

    static void printMaxNumber(int[] arr) {

        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int counter=0;
        int next=arr[n-2];
        for (int i = n - 1; i >= 0; i--) {
            /*if (arr[i] > min) {
                counter++;
                System.out.println(arr[i]);
            }
            if (arr[i] <= min) {
                min = arr[i];
            }*/
            if(arr[i]>next){
                System.out.println(arr[i]);
            }
            if(arr[i]<=next){
                next=arr[i];
            }
        }
        System.out.println(counter);
    }
}
