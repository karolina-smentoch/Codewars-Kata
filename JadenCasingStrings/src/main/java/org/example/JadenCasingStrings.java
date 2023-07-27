package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import static sun.text.normalizer.UTF16.charAt;

//Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
// Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter,
// he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word,
// check out how contractions are expected to be in the example below.
//
//Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from
// Jaden Smith, but they are not capitalized in the same way he originally typed them.
//
//Example:
//Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
//Note that the Java version expects a return value of null for an empty string or null.
public class JadenCasingStrings {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) {
            return null;
        } else {
            String[] singleWords = phrase.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < singleWords.length; i++) {
                if (!(i == 0)) {
                    String string = singleWords[i].replace(singleWords[i].charAt(0), singleWords[i].toUpperCase().charAt(0));
                    sb.append(" ");
                    sb.append(string);
                } else {
                    String string = singleWords[i].replace(singleWords[i].charAt(0), singleWords[i].toUpperCase().charAt(0));
                    sb.append(string);
                }
            }
            return sb.toString();
        }
    }
}
