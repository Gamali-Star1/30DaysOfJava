//A program to check a number if is palindrome or not;
// if its a palindrome it return true and if not return false
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit;
        int num = number;
        while((num != 0) || (num > 0)){
            lastDigit = num % 10;
            reverse = reverse*10 +lastDigit;
            num = num/10;
        }
        if(number == reverse){
            return true;
        }
        return false;
    }
}