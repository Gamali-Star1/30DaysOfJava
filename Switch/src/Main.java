//A program to print square star

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
//        Account bobsAccount = new Account();//"01117829", 2.5, "Gamali", "gamalio27@gmail.com", "(+225)-656-902-081";
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsAccount = new Account("Tim", "tim@gmail.com", "0744733");
//        timsAccount.withdrawal(102.9);
//        System.out.println("A/C " + timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
//        System.out.println("Current balance= " + timsAccount.getBalance());

//        VipPerson person1 = new VipPerson();
//        System.out.println(person1.getName());
//
//        VipPerson person2 = new VipPerson("Gamali", 857.23);
//        System.out.println(person2.getName());
//
//        VipPerson person3 = new VipPerson("Anna", 346.89, "anna@gmail.com");
//        System.out.println(person3.getName());
    }
}