/*
 * After the Serbian Informatics Olympiad, Aleksa was very sad, because he
 * didn't win a medal (he didn't know stack), so Vasilije came to give him an
 * easy problem, just to make his day better.
 * 
 * Vasilije gave Aleksa a positive integer n
 * (n≥3
 * ) and asked him to construct a strictly increasing array of size n
 * of positive integers, such that
 * 
 * 3⋅ai+2
 * is not divisible by ai+ai+1
 * for each i
 * (1≤i≤n−2
 * ).
 * Note that a strictly increasing array a
 * of size n
 * is an array where ai<ai+1
 * for each i
 * (1≤i≤n−1
 * ).
 * Since Aleksa thinks he is a bad programmer now, he asked you to help him find
 * such an array.
 * 
 * Input
 * Each test consists of multiple test cases. The first line contains a single
 * integer t
 * (1≤t≤104
 * ) — the number of test cases. The description of test cases follows.
 * 
 * The first line of each test case contains a single integer n
 * (3≤n≤2⋅105
 * ) — the number of elements in array.
 * 
 * It is guaranteed that the sum of n
 * over all test cases does not exceed 2⋅105
 * .
 * 
 * Output
 * For each test case, output n
 * integers a1,a2,a3,…,an
 * (1≤ai≤109
 * ).
 * 
 * It can be proved that the solution exists for any n
 * . If there are multiple solutions, output any of them.
 */

import java.util.Scanner;

public class AleksaAndStack {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int t = io.nextInt();

        while (t-- > 0) {
            int n = io.nextInt();

            int temp = n;

            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = temp + 1;
                temp++;
            }

            int index = 0;

            while (index < n - 2) {
                boolean condition = (3 * nums[index + 2]) % (nums[index + 1] + nums[index]) == 0;

                if (condition) {
                    nums[index] += 1;
                    nums[index + 1] += 1;
                    nums[index + 2] += 1;
                } else {
                    index++;
                }
            }

            for (int j = 0; j < n; j++) {
                System.out.println(nums[j]);
            }

        }

        io.close();
    }
}