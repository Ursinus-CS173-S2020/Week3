package week3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void sayHello() {
        System.out.println("Hello");
    }
    public static void sayGoodbye() {
        System.out.println("Bye!");
    }
    public static int giveMeFive() {
        return 5;
    }
    public static boolean isEven(double num) {
        boolean result = false;
        if (num % 2 == 0) {
            result = true;
        }
        return result;
    }
    public static void main(String[] args) {       
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter number: ");
        double num = in.nextDouble();
        boolean result = isEven(num);
        if (!result) {
            System.out.println("It's odd!");
        }
        else {
            System.out.println("It's even!");
        }
    }
    
}
