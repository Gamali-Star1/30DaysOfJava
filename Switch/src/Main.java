//A program that show if first & second number has shared
//the same digit return true otherwise return false

public class Main {
    public static void main(String[] args) {
        System.out.println(hasShareDigit(12, 23));
    }
//Method to show whether first & second number has shared the same
    //digit it will return true otherwise return false
    public static boolean hasShareDigit(int number1, int number2){
        //find digit in the number from the left
        int a = number1/10;
        int b = number2/10;
        // find digit in the number from right
        int c = number1 % 10;
        int d = number2 % 10;

        if(((number1 >= 10) && (number1 <= 99)) && ((number2 >= 10) && (number2 <= 90))){
            if((a == b) || (a == c) || (a == d) || (b == c) || (b == d) || (c == d))
                return true;
            else
                return false;
        }return false;
    }
}