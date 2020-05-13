//A program to show if the number is a perfect number

public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    //A method in a program to show if the number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) {
            return false;
        } else {
                for (int j = 1; j < number; j++) {
                    if (number % j == 0) {
                        sum += j;
                    }
                }
                if (sum == number)
                    return true;
                else
                    return false;
            }
    }
    }