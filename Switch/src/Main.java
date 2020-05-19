//A program to print square star

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();//"01117829", 2.5, "Gamali", "gamalio27@gmail.com", "(+225)-656-902-081";
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@gmail.com", "0744733");
        System.out.println("A/C " + timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
    }
}