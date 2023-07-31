package org.example;

/**
 * Messi is a soccer player with goals in three leagues:
 * <p>
 * LaLiga
 * Copa del Rey
 * Champions
 * Complete the function to return his total number of goals in all three leagues.
 * <p>
 * Note: the input will always be valid.
 * <p>
 * For example:
 * <p>
 * 5, 10, 2  -->  17
 */
public class MessiGoals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
}
