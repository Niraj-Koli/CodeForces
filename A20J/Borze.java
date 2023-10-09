/*
 * Ternary numeric notation is quite popular in Berland. To telegraph the
 * ternary number the Borze alphabet is used. Digit 0 is transmitted as «.», 1
 * as «-.» and 2 as «--». You are to decode the Borze code, i.e. to find out the
 * ternary number given its representation in Borze alphabet.
 * 
 * Input
 * The first line contains a number in Borze code. The length of the string is
 * between 1 and 200 characters. It's guaranteed that the given string is a
 * valid Borze code of some ternary number (this number can have leading
 * zeroes).
 * 
 * Output
 * Output the decoded ternary number. It can have leading zeroes.
 */

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String borzeCode = input.next();

        String number = "";

        for (int i = 0; i < borzeCode.length(); i++) {
            if (borzeCode.charAt(i) == '.') {
                number += '0';
            } else if (borzeCode.charAt(i) == '-') {
                if (borzeCode.charAt(i + 1) == '.') {
                    number += '1';
                } else if (borzeCode.charAt(i + 1) == '-') {
                    number += '2';
                }
                i++;
            }
        }

        System.out.println(number);

        input.close();
    }
}