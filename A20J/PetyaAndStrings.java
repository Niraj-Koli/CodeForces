/*
 * Little Petya loves presents. His mum bought him two strings of the same size
 * for his birthday. The strings consist of uppercase and lowercase Latin
 * letters. Now Petya wants to compare those two strings lexicographically. The
 * letters' case does not matter, that is an uppercase letter is considered
 * equivalent to the corresponding lowercase letter. Help Petya perform the
 * comparison.
 * 
 * Input
 * Each of the first two lines contains a bought string. The strings' lengths
 * range from 1 to 100 inclusive. It is guaranteed that the strings are of the
 * same length and also consist of uppercase and lowercase Latin letters.
 * 
 * Output
 * If the first string is less than the second one, print "-1". If the second
 * string is less than the first one, print "1". If the strings are equal, print
 * "0". Note that the letters' case is not taken into consideration when the
 * strings are compared.
 */

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        StringBuilder s1 = new StringBuilder(io.next());
        StringBuilder s2 = new StringBuilder(io.next());

        int result = 0;

        int n = s1.length();

        for (int i = 0; i < n; i++) {
            char s1Char = Character.toLowerCase(s1.charAt(i));
            char s2Char = Character.toLowerCase(s2.charAt(i));

            if (s1Char > s2Char) {
                result = 1;
                break;
            } else if (s1Char < s2Char) {
                result = -1;
                break;
            }
        }

        System.out.println(result);

        io.close();
    }
}