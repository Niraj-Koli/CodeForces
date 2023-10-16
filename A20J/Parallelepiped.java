/*
 * You've got a rectangular parallelepiped with integer edge lengths. You know
 * the areas of its three faces that have a common vertex. Your task is to find
 * the sum of lengths of all 12 edges of this parallelepiped.
 * 
 * Input
 * The first and the single line contains three space-separated integers — the
 * areas of the parallelepiped's faces. The area's values are positive ( > 0)
 * and do not exceed 104. It is guaranteed that there exists at least one
 * parallelepiped that satisfies the problem statement.
 * 
 * Output
 * Print a single number — the sum of all edges of the parallelepiped.
 */

//  Let a, b and c be the lengths of the sides that have one common vertex. Then the numbers we are given are s1 = ab, s2 = bc и s3 = ca. It is easy to find the lengths in terms of faces areas: a = sqrt(s1 * s3 / s2), b = sqrt(s2 * s1 / s3), c = sqrt(s2 * s3 / s1). The answer is 4(a + b + c), because there are four sides that have lengths equal to a, b and c.

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int s1 = io.nextInt();
        int s2 = io.nextInt();
        int s3 = io.nextInt();

        int a = (int) Math.sqrt(s1 * s3 / s2);
        int b = (int) Math.sqrt(s2 * s1 / s3);
        int c = (int) Math.sqrt(s2 * s3 / s1);

        System.out.println(4 * (a + b + c));

        io.close();
    }
}