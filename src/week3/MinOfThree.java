package week3;

import java.util.Scanner;

public class MinOfThree {
    public static String minOfThree(double a, double b, double c){
        String smallest = "a";
        if (b < c && b <a){
            smallest = "b";
        }
        else if (c < a && c < b){
            smallest = "c";
        }
        return smallest;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("enter 'a' value: ");
      double a = in.nextDouble();
      System.out.println("enter 'b' value: ");
      double b = in.nextDouble();
      System.out.println("enter 'c' value: ");
      double c = in.nextDouble();
      String smallest = minOfThree(a, b, c);
      System.out.print(smallest);
      System.out.println(" is the smallest");
    }
}
