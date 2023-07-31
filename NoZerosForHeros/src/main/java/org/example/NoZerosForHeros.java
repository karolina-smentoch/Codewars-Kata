package org.example;

import java.math.BigDecimal;

/**
 * Numbers ending with zeros are boring.
 * <p>
 * They might be fun in your world, but not here.
 * <p>
 * Get rid of them. Only the ending ones.
 * <p>
 * 1450 -> 145
 * 960000 -> 96
 * 1050 -> 105
 * -1050 -> -105
 * Zero alone is fine, don't worry about it. Poor guy anyway
 */
public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        if (!(n == 0)) {
            return Integer.valueOf(String.valueOf(n).replaceAll("0+$", ""));
        } else {
            return n;
        }
    }
}
