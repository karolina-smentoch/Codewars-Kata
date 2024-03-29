package org.example;

//Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.
//
//Numerical Score	Letter Grade
//90 <= score <= 100	'A'
//80 <= score < 90	'B'
//70 <= score < 80	'C'
//60 <= score < 70	'D'
//0 <= score < 60	'F'
//
//Tested values are all between 0 and 100. There is no need to check for negative values or values greater than 100.

public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        char grade = 'F';
        int average = (s1+s2+s3)/3;
        if (average >= 0 && average < 60) {
        } else if ((average >= 60 && average < 70)) {
            grade = 'D';
        } else if ((average >= 70 && average < 80)) {
            grade = 'C';
        } else if ((average >= 80 && average < 90)) {
            grade = 'B';
        } else if ((average >= 90 && average <= 100)) {
            grade = 'A';
        }
        return grade;
    }
}
