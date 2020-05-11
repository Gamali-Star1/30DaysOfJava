//A program that sum up first and last digit

public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }

    // A program to get the sum of even numbers;
    public static int getEvenDigitSum(int number){
      int evenDigitSum = 0;
      int lastDigit = 0;
      if(number < 0){
          return -1;
      }
      while(number != 0){
          //Find the last digit
          lastDigit = number % 10;
          //Check if the last digit is even
          if(lastDigit % 2 == 0){
              //Add last digit to even digit sum
              evenDigitSum += lastDigit;

          }
          //remove the last number
          number /= 10;
      }return evenDigitSum;
    }
}