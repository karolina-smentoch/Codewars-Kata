package org.example;

//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive.
// The string can contain any char.
//
//Examples input/output:
//
//XO("ooxx") => true
//XO("xooxx") => false
//XO("ooxXm") => true
//XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//XO("zzoo") => false

import java.util.ArrayList;
import java.util.List;

public class ExesAndOhs {
    public static boolean getXO(String str) {
       long ohs = str.chars().filter(ch->ch == 'o' || ch == 'O').count();
       long exes = str.chars().filter(ch->ch == 'x' || ch == 'X').count();
        return ohs==exes;
    }

}
