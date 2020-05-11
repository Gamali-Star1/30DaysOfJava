//A program that compare last digit
//A program to check if the number are within the given range

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid(1051));
    }

    //A Method to compare a last digit if are the same within 3 numbers
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        //Find the right most digit
        int a = num1 % 10;
        int b = num2 % 10;
        int c = num3 % 10;

        //write if statement to check whether these numbers are within
        //10 and 1000 inclusive and return true otherwise return false
        if(((num1 >= 10) && (num1 <= 1000)) && ((num2 >= 10) && (num2 <= 1000)) && ((num3 >= 10) && (num3 <= 1000))){
            if((a == b) || (a == c) || (b == c))
                return true;
            else
                return false;
        }return false;
    }

    //This method using one parameter of type int to if it is within
    //10 to 1000 inclusive and return true otherwise return false
    public static boolean isValid(int num){
        if((num >= 10) && (num <= 1000))
            return true;
        else
            return false;
    }
}