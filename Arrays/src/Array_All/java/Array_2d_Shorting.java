/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_All.java;

/**
 *
 * @author User
 */
/*from Shamim vai*/
public class Array_2d_Shorting {

    public static void main(String[] args) {
        int[][] series = {
            {1, 99, 91, 11, 44},
            {0, 10, 9, 9, 11},
            {9, 23, 21, 5, 20},
            {13, 4, 45, 66, 33},
            {11, 0, 1, 20, 56}
        };
        System.out.println("The Array shows on Assending order : ");
        int temp = 0;
        //1st loop k for selecting array---
        for (int i = 0; i < series.length; i++) {
            //System.out.print((i + 1) + " Array : ");
            for (int j = 0; j < series[i].length; j++) {
                for (int k = j + 1; k < series[i].length - 1; k++) {
                    if (series[i][j] > series[i][k + 1]) {
                        temp = series[i][j];
                        series[i][j] = series[i][k + 1];
                        series[i][k + 1] = temp;
                    }
                }
                System.out.print(series[i][j] + " ");

            }
            System.out.println("");

        }

    }
}
