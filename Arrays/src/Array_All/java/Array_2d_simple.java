
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Array_2d_simple {
    public static void main(String[] args) {
        int[][] x = {
            {6, 25, 4, 0, 47},
            {4, 54, 2, 5, 2},
            {317, 10, 27, 1, 5},
            {43, 10, 27, 10, 5},
            {36, 100, 47, 1, 50}
        };
        int temp = 0;
        for (int k = 0; k < x.length; k++) {
            int[] a = x[k];
            for (int j = 0; j < a.length - 1; j++) {
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                    }
                }
            }

        }
        System.out.println("The Array is now Assending order : ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i]));
        }

    }

    
}
