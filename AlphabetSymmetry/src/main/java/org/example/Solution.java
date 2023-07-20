package org.example;

//Consider the word "abode". We can see that the letter a is in position 1 and b is in position 2. In the alphabet, a and b are also in positions 1 and 2.
// Notice also that d and e in abode occupy the positions they would occupy in the alphabet, which are positions 4 and 5.
//Given an array of words, return an array of the number of letters that occupy their positions in the alphabet for each word. For example,
//
//solve(["abode","ABc","xyzD"]) = [4, 3, 1]
//See test cases for more examples.
//
//Input will consist of alphabet characters, both uppercase and lowercase. No spaces.

import java.sql.Array;

public class Solution {
    public static int[] solve(String[] arr) {
        int[] results = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if ((int) (arr[i].toLowerCase().charAt(j)) - 97 == j) {
                    results[i]++;
                }
            }
        }
        return results;
    }
}
