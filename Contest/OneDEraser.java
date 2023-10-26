/*
 * You are given a strip of paper s
 * that is n
 * cells long. Each cell is either black or white. In an operation you can take
 * any k
 * consecutive cells and make them all white.
 * 
 * Find the minimum number of operations needed to remove all black cells.
 * 
 * Input
 * The first line contains a single integer t
 * (1≤t≤1000
 * ) — the number of test cases.
 * 
 * The first line of each test case contains two integers n
 * and k
 * (1≤k≤n≤2⋅105
 * ) — the length of the paper and the integer used in the operation.
 * 
 * The second line of each test case contains a string s
 * of length n
 * consisting of characters B
 * (representing a black cell) or W
 * (representing a white cell).
 * 
 * The sum of n
 * over all test cases does not exceed 2⋅105
 * .
 * 
 * Output
 * For each test case, output a single integer — the minimum number of
 * operations needed to remove all black cells.
 */

import java.util.Scanner;

public class OneDEraser {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int t = io.nextInt();

        while (t-- > 0) {
            int n = io.nextInt();
            int k = io.nextInt();

            String s = io.next();

            int i = 0;

            int ans = 0;

            while (i < n) {
                if (s.charAt(i) == 'B') {
                    ans++;

                    i = i + k;
                } else {
                    i++;
                }
            }
            System.out.println(ans);
        }

        io.close();
    }
}