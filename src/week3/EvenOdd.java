/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4class;

import java.util.Scanner;

/**
 *
 * @author ctralie
 */


public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if (isEven(num)) {
            System.out.println("It's even!");
        }
        else {
            System.out.println("It's odd!");
        }
    }
    
    public static boolean isEven(int num) {
        boolean result = false;
        if (num % 2 == 0) {
            result = true;
        }
        return result;
    }
}
