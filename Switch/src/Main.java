//A program to calculate the largest prime factor in a number

public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(-1));
    }
    //Method in program to calculate the largest prime factor in number
    public static int getLargestPrime(int number){
        int i;
        if (number < 2){
            return -1;
        }else {
            for (i = 2; i <= number; i++){
                if (number % i == 0){
                    number = number/i;
                    i--;
                }
            }return i;
        }
    }
}