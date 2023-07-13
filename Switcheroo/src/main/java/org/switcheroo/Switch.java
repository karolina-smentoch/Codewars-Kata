package org.switcheroo;

public class Switch {
    public static String switcheroo(String x) {
        String s1 = x.replace("a","o");
        String s2 = s1.replace("b","a");
        String s3 = s2.replace("o","b");
        return s3;
    }
}
