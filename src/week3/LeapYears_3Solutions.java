package lab2_leapyears;
import java.util.Scanner;

public class Lab2_LeapYears {

    public static boolean isALeapYear_Solution1(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (!(year % 100 == 0)) {
                isLeap = true;
            }
            else if (year % 400 == 0) {
                isLeap = true;
            }
            else {
                isLeap = false;
            }
        }
        return isLeap;
    }
    
    public static boolean isALeapYear_Solution2(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            isLeap = true;
        }
        if (year % 100 == 0) {
            isLeap = false;
        }
        if (year % 400 == 0) {
            isLeap = true;
        }
        return isLeap;
    }
    
    
    public static boolean isALeapYear_Solution3(int year) {
        boolean isLeap = false;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ){
            isLeap = true;
        }
        return isLeap;
    }

    
}
