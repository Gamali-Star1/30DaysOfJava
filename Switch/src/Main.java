//A program that sum up first and last digit

public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }
//A program that sum first and last digit
    public static int sumFirstAndLastDigit(int number){
        int firstDigit = 0;
        int lastDigit = number % 10;
        int sum;
        if(number < 0){
            return -1;
        }else {
            while (number > 0){
                firstDigit = number;
                number = number/10;
            }
            sum = firstDigit + lastDigit;
        }return sum;
    }
}