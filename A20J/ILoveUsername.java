/*
 * Vasya adores sport programming. He can't write programs but he loves to watch
 * the contests' progress. Vasya even has a favorite coder and Vasya pays
 * special attention to him.
 * 
 * One day Vasya decided to collect the results of all contests where his
 * favorite coder participated and track the progress of his coolness. For each
 * contest where this coder participated, he wrote out a single non-negative
 * number — the number of points his favorite coder earned in the contest. Vasya
 * wrote out the points for the contest in the order, in which the contests run
 * (naturally, no two contests ran simultaneously).
 * 
 * Vasya considers a coder's performance in a contest amazing in two situations:
 * he can break either his best or his worst performance record. First, it is
 * amazing if during the contest the coder earns strictly more points that he
 * earned on each past contest. Second, it is amazing if during the contest the
 * coder earns strictly less points that he earned on each past contest. A
 * coder's first contest isn't considered amazing. Now he wants to count the
 * number of amazing performances the coder had throughout his whole history of
 * participating in contests. But the list of earned points turned out long and
 * Vasya can't code... That's why he asks you to help him.
 * 
 * Input
 * The first line contains the single integer n (1 ≤ n ≤ 1000) — the number of
 * contests where the coder participated.
 * 
 * The next line contains n space-separated non-negative integer numbers — they
 * are the points which the coder has earned. The points are given in the
 * chronological order. All points do not exceed 10000.
 * 
 * Output
 * Print the single number — the number of amazing performances the coder has
 * had during his whole history of participating in the contests.
 */

import java.util.Scanner;

public class ILoveUsername {
    public static int iLove(int n, int[] contest) {
        if (contest.length == 1) {
            return 0;
        }

        int amazing = -1;

        if (contest[0] == contest[1]) {
            amazing = 0;
        } else {
            amazing = 1;
        }

        int max = 0;
        int min = 0;

        if (contest[0] > contest[1]) {
            max = contest[0];
            min = contest[1];
        } else {
            max = contest[1];
            min = contest[0];
        } 

        for (int i = 2; i < n; i++) {
            if (contest[i] > max) {
                max = contest[i];

                amazing++;
            } else if (contest[i] < min) {
                min = contest[i];
                amazing++;
            }
        }

        return amazing;
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int n = io.nextInt();

        int[] contest = new int[n];

        for (int i = 0; i < n; i++) {
            contest[i] = io.nextInt();
        }

        int result = iLove(n, contest);

        System.out.println(result);

        io.close();
    }
}