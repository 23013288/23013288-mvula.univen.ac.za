/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.com1321project1;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author MADIBA
 */
public class Com1321project1 {

    public static void main(String[] args) {
        //TODO code application logic here
        Scanner faith = new Scanner (System.in);
        
        int number1,number2,subtract;
        System.out.println("Enter the first number");
        number1 = faith.nextInt();
        System.out.println("Enter the second number");
        number2 = faith.nextInt();
        subtract = number1-number2;
        System.out.println("difference between two numbers"+subtract);
        
    }
}
