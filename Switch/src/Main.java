import javax.swing.*;

//A program shows if isLeapYear and get days in month
public class Main {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, -2020));
    }

    //A program shows a if the year isLeapYear
    public static boolean isLeapYear(int year){
        if((year >= 1) && (year <= 9999)){
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    //A program shows get month of the year
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if((year >= 1) && (year <= 9999))
                    return 31;
                else
                    return -1;
            case 2:
                if((year >= 1) && (year <= 9999))
                    if(isLeapYear(year))
                        return 29;
                    else
                        return 28;
                else
                    return -1;
            case 4: case 6: case 9: case 11:
                if((year >= 1) && (year <= 9999))
                    return 30;
                else
                    return -1;
            default:
                return -1;
        }
    }
}