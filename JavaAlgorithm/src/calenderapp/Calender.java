/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//first step to create main function
package calenderapp;

/**
 *
 * @author Mehedi Hassan
 */
public class Calender {

    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        int i, j, weekDay = 0, spacecounter = 0;

        for (i = 0; i < 12; i++) {
            System.out.println("\n\n\n----------------------" + months[i] + "--------------------");
            System.out.println("\n\n\n\n\tSun     Mon     Tue     Wed     Thu     Fri      sat");

            for (spacecounter = 1; spacecounter <= weekDay; spacecounter++) {
                System.out.print("12345678");
            }
            int totalDays = daysInMonth[i];
            for (j = 1; j <= totalDays; j++) {
                System.out.print("\t" + j);
                weekDay++;
                if (weekDay > 6) {
                    weekDay = 0;
                    System.out.println("\n");
                }

            }

        }

    }

}
