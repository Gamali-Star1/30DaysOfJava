//A program to find a greatest common divisor

public class Main {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    //A method in a program to find a greatest common divisor
    public static int getGreatestCommonDivisor(int first, int second) {
        int gcd = 1;
        if ((first < 10) || (second < 10)) {
            return -1;
        } else {
                if (first > second) {
                    for (int i = second; i > 1; i--) {
                        if ((first % i == 0) && (second % i == 0)) {
                            return i;
                        }
                    }
                } else {
                    for (int j = first; j > 1; j--) {
                        if ((first % j == 0) && (second % j == 0)) {
                            return j;
                        }
                    }
                }
            }return gcd;
    }
}