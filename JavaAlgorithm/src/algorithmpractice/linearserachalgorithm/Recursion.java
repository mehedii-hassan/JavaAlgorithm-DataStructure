/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmpractice.linearserachalgorithm;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class Recursion {

    static Scanner scanner = new Scanner(System.in);

    static public int fact(int n) {
        //base case--------------------------------
        if (n == 1) {
            return 1;
        } else {
            //recursive calling ---------------------------
            return n * fact(n - 1);

        }

    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int a = fact(n);
        System.out.println("Factorial of " + n + " is " + a);

    }

}
