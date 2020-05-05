public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 9; i++){
            System.out.println("When amount is 10000 and interest rate " + i + "% and interest is " + calculateInterest(10000, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }


}