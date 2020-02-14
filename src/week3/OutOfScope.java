/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author ctralie
 */
public class OutOfScope {
    public static int addFive(int var) {
        String prof = "Chris";
        int mynum = 17;
        return var + 5;
    }

    public static void main(String[] args) {
        int result = addFive(2); 
        System.out.println(result);
    }
}
