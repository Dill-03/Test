/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_All.java;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Array_Months {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       String[] months = {"January", "February", "March", " April ", "May", " June", " July", " August", " September",
             "October", " November", "December"};
        System.out.println("Enter number 1 to 12 for month name : ");
        int user = input.nextInt();
        System.out.println("The month is : " + months[user - 1]);
       
        System.out.println("The size of number is :"+months.length);
       }
        
    }



