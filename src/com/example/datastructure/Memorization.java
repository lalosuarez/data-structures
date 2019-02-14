package com.example.datastructure;

import java.util.Arrays;

public class Memorization {

    public static void main(String[] args) {
        int[] letters = new int[128];
        char[] arr = "abc".toCharArray();
        System.out.println(arr);
        for (char c : arr) {
            System.out.println((byte)c);
            letters[c]++;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println(letters['a']);
    }
}
