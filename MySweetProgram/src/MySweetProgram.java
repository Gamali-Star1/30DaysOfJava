import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println((s1 == s2) + " " + s1.equals(s2));
    }
}
