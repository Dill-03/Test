/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_All.java;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Arry_2d_shorting {

    public static void main(String[] args) {
        int[][] arr = {
            {11, 45, 78, 89, 2},
            {3, 41, 45, 56, 12},
            {45, 12, 56, 23, 78},
            {89, 89, 45, 12, 23},
            {45, 89, 45, 12, 89}
        };

        System.out.println("The Array is now Assending order : ");
        int temp;
        //1st loop k for selecting array---
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr[k].length - 1; i++) {
                for (int j = 0; j < arr[k].length - 1; j++) {
                    if (arr[k][j] > arr[k][j + 1]) {
                        temp = arr[k][j];
                        arr[k][j] = arr[k][j + 1];
                        arr[k][j + 1] = temp;
                        //System.out.print(arr[i][j] + " ");
                        
                    }
                }
            }
            System.out.println(Arrays.toString(arr[k]));
        }
        //int[] a = arr[k];

       /* for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println(" ");
        }

        System.out.println(" ");
    }*/
}}
