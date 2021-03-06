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
public class BinaryConversion {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        int number =n;

        int[] arr = new int[8];
        while (number != 0) {
            arr[i] = number % 2;
            number = number / 2;
            i++;

        }
        
        System.out.print("binary number of "+n+" is ");
        for (int j = n-1; j >=0; j--) {
            System.out.print(arr[j]);
            
        }
        System.out.println("");

    }

}
