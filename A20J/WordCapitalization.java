/*
 * Capitalization is writing a word with its first letter as a capital letter.
 * Your task is to capitalize the given word.
 * 
 * Note, that during capitalization all the letters except the first one remains
 * unchanged.
 * 
 * Input
 * A single line contains a non-empty word. This word consists of lowercase and
 * uppercase English letters. The length of the word will not exceed 103.
 * 
 * Output
 * Output the given word after capitalization.
 */

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        String s = io.next();

        String result = "";

        result = result + Character.toUpperCase(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            result = result + s.charAt(i);
        }

        System.out.println(result);

        io.close();
    }
}