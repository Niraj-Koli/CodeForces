/*
 * Slavic is preparing a present for a friend's birthday. He has an array a
 * of n
 * digits and the present will be the product of all these digits. Because
 * Slavic is a good kid who wants to make the biggest product possible, he wants
 * to add 1
 * to exactly one of his digits.
 * 
 * What is the maximum product Slavic can make?
 * 
 * Input
 * The first line contains a single integer t
 * (1≤t≤104
 * ) — the number of test cases.
 * 
 * The first line of each test case contains a single integer n
 * (1≤n≤9
 * ) — the number of digits.
 * 
 * The second line of each test case contains n
 * space-separated integers ai
 * (0≤ai≤9
 * ) — the digits in the array.
 * 
 * Output
 * For each test case, output a single integer — the maximum product Slavic can
 * make, by adding 1
 * to exactly one of his digits.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int t = io.nextInt();

        while (t-- > 0) {
            int min = Integer.MAX_VALUE;

            int n = io.nextInt();

            List<Integer> arr = new ArrayList<>();

            int minIndex = -1;

            for (int i = 0; i < n; i++) {
                int ele = io.nextInt();

                arr.add(ele);

                if (min > ele) {
                    min = Math.min(min, ele);
                    minIndex = i;
                }
            }

            int value = arr.get(minIndex) + 1;

            arr.remove(minIndex);

            for (int j = 0; j < arr.size(); j++) {
                value = value * arr.get(j);
            }

            System.out.println(value);
        }

        io.close();
    }
}