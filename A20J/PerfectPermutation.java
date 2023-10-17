/*
 * A permutation is a sequence of integers p1, p2, ..., pn, consisting of n
 * distinct positive integers, each of them doesn't exceed n. Let's denote the
 * i-th element of permutation p as pi. We'll call number n the size of
 * permutation p1, p2, ..., pn.
 * 
 * Nickolas adores permutations. He likes some permutations more than the
 * others. He calls such permutations perfect. A perfect permutation is such
 * permutation p that for any i (1 ≤ i ≤ n) (n is the permutation size) the
 * following equations hold ppi = i and pi ≠ i. Nickolas asks you to print any
 * perfect permutation of size n for the given n.
 * 
 * Input
 * A single line contains a single integer n (1 ≤ n ≤ 100) — the permutation
 * size.
 * 
 * Output
 * If a perfect permutation of size n doesn't exist, print a single integer -1.
 * Otherwise print n distinct integers from 1 to n, p1, p2, ..., pn —
 * permutation p, that is perfect. Separate printed numbers by whitespaces.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PerfectPermutation {
    public static List<Integer> perfectPermutation(int n) {
        List<Integer> list = new ArrayList<>();

        if (n % 2 != 0) {
            list.add(-1);

            return list;
        }

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        for (int j = 0; j < n - 1; j++) {
            Collections.swap(list, j, j + 1);
            j++;
        }

        return list;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        List<Integer> result = perfectPermutation(n);

        result.forEach((value) -> {
            System.out.println(value);
        });

        input.close();
    }
}