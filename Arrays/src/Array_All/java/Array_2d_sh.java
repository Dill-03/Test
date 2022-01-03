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
public class Array_2d_sh {

    public static void main(String[] args) {
        int[][] arr = {
            {6, 25, 4, 0, 47},
            {4, 54, 2, 5, 2},
            {317, 10, 27, 1, 5}
           
        };
        int temp = 0;
        for (int k = 0; k < arr.length; k++) {
            int[] a = arr[k];
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        
                    }
                    
                }
                
            }
            
        }
        System.out.println("The Array is now Assending order : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr[j]));
            
        }
    }
    
}
