/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_All.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Arraylist {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> p = new ArrayList();

        System.out.println("Enter an integer number.. ");
        int user = input.nextInt();

        int arr[] = new int[user];
        //int count = 0;
        System.out.println("Enter elements : ");
        for(int i=0;i<user;i++){
        arr[i]=input.nextInt();
        }
        //code for search...
        for (int i = 0; i < arr.length; i++) {
            if (user == arr[i]) {
                p.add(i);
                //count++;
            }

        }
        if (p.size() > 0) {
            System.out.println("Number is found "+p.size()+" times "
                    +"\nAnd index number : "+p);
        } else {
            System.out.println("Number is not found.");
        }
    }
}
