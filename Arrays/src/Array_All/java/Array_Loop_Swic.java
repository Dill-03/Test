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
public class Array_Loop_Swic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> arr = new ArrayList();
        System.out.println("Enter 1 for add data :");
        System.out.println("Enter 2 for remove data :");
        System.out.println("Enter 0 for Stop :");
        int user = input.nextInt();

        while (user != 0) {
            switch (user) {
                case 1:
                    System.out.println("Enter data : ");
                    String data1 = input.next();
                    arr.add(data1);
                    break;
                case 2:
                    System.out.println("Enter index to remove : ");
                    int data2 = input.nextInt();
                    arr.remove(data2);
                    break;
                default:
                    System.out.println("Invalid... ");

                    break;
            }
            System.out.println(arr);
            System.out.println("Enter 1 for add data :");
            System.out.println("Enter 2 for remove data :");
            System.out.println("Enter 0 for Stop :");
            user = input.nextInt();
        }
        System.out.println("Final status : "+arr);
    }

}
