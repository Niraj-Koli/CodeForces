/*
 * There are n children in Jzzhu's school. Jzzhu is going to give some candies
 * to them. Let's number all the children from 1 to n. The i-th child wants to
 * get at least ai candies.
 * 
 * Jzzhu asks children to line up. Initially, the i-th child stands at the i-th
 * place of the line. Then Jzzhu start distribution of the candies. He follows
 * the algorithm:
 * 
 * Give m candies to the first child of the line.
 * If this child still haven't got enough candies, then the child goes to the
 * end of the line, else the child go home.
 * Repeat the first two steps while the line is not empty.
 * Consider all the children in the order they go home. Jzzhu wants to know,
 * which child will be the last in this order?
 * 
 * Input
 * The first line contains two integers n, m (1 ≤ n ≤ 100; 1 ≤ m ≤ 100). The
 * second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100).
 * 
 * Output
 * Output a single integer, representing the number of the last child.
 */

import java.util.Scanner;

public class JzzhuAndChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] > max) {
                max = a[i];
            }
        }

        int last = 0;

        for (int i = 0; i < n; i++) {
            int t = (a[i] + m - 1) / m;

            if (t >= last) {
                last = t;
                max = i + 1;
            }
        }

        System.out.println(max);

        sc.close();
    }
}