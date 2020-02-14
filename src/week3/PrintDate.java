/*
 * Create a method that takes in a date as three integers
 * month, year, and day, and returnss a nice formatted date.
 * For example, 2/3/2018 should be printed as "February 3, 2018"
 */
package week3;

public class PrintDate {
    public static String getDateString(int year, int month, int day) {
        String dateString = "January";
        switch(month) {
            case 2:
                dateString = "February";
                break;
            case 3:
                dateString = "March";
                break;
            case 4:
                dateString = "April";
                break;
            case 5:
                dateString = "May";
                break;
            case 6:
                dateString = "June";
                break;
            case 7:
                dateString = "July";
                break;
            case 8:
                dateString = "August";
                break;
            case 9:
                dateString = "September";
                break;
            case 10:
                dateString = "October";
                break;
            case 11:
                dateString = "November";
                break;
            case 12:
                dateString = "December";
                break;
            default:
                dateString = "Unknown";
        }
        dateString = dateString + " " + day + ", " + year;
        return dateString;
    }
    
    public static void main(String[] args) {
        System.out.println(getDateString(2020, 2, 14));
    }
}
