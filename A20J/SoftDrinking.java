/*
 * This winter is so cold in Nvodsk! A group of n friends decided to buy k
 * bottles of a soft drink called "Take-It-Light" to warm up a bit. Each bottle
 * has l milliliters of the drink. Also they bought c limes and cut each of them
 * into d slices. After that they found p grams of salt.
 * 
 * To make a toast, each friend needs nl milliliters of the drink, a slice of
 * lime and np grams of salt. The friends want to make as many toasts as they
 * can, provided they all drink the same amount. How many toasts can each friend
 * make?
 * 
 * Input
 * The first and only line contains positive integers n, k, l, c, d, p, nl, np,
 * not exceeding 1000 and no less than 1. The numbers are separated by exactly
 * one space.
 * 
 * Output
 * Print a single integer — the number of toasts each friend can make.
 */

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int n = io.nextInt();
        int k = io.nextInt();
        int l = io.nextInt();
        int c = io.nextInt();
        int d = io.nextInt();
        int p = io.nextInt();

        int nl = io.nextInt();
        int np = io.nextInt();

        int totalDrink = k * l;
        int totalLime = c * d;
        int totalSalt = p;

        int drink = totalDrink / nl;
        int lime = totalLime;
        int salt = totalSalt / np;

        int toast = Math.min(drink, Math.min(lime, salt)) / n;

        System.out.println(toast);

        io.close();
    }
}