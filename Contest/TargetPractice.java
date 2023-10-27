/*
 * A 10×10
 * target is made out of five "rings" as shown. Each ring has a different point
 * value: the outermost ring — 1 point, the next ring — 2 points, ..., the
 * center ring — 5 points.
 * 
 * 
 * Vlad fired several arrows at the target. Help him determine how many points
 * he got.
 * 
 * Input
 * The input consists of multiple test cases. The first line of the input
 * contains a single integer t
 * (1≤t≤1000
 * ) — the number of test cases.
 * 
 * Each test case consists of 10 lines, each containing 10 characters. Each
 * character in the grid is either X
 * (representing an arrow) or .
 * (representing no arrow).
 * 
 * Output
 * For each test case, output a single integer — the total number of points of
 * the arrows.
 */

import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int t = io.nextInt();

        while (t-- > 0) {
            String s = io.next();

            int points = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'X') {
                    if ((i >= 0 && i <= 9) || (i >= 90 && i <= 99) || (i % 10 == 0) || (i % 10 == 9)) {
                        points = points + 1;
                    } else if ((i >= 21 && i <= 28) || (i >= 81 && i <= 88) || (i % 10 == 1) || (i % 10 == 8)) {
                        points = points + 2;
                    } else if ((i >= 32 && i <= 37) || (i >= 72 && i <= 77) || (i % 10 == 2) || (i % 10 == 7)) {
                        points = points + 3;
                    } else if ((i >= 43 && i <= 46) || (i >= 63 && i <= 66) || (i % 10 == 3) || (i % 10 == 6)) {
                        points = points + 4;
                    } else {
                        points = points + 5;
                    }
                }
            }
            System.out.println(points);
        }

        io.close();
    }
}