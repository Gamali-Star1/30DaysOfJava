import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give us a size: ");
        int size = in.nextInt();
        int[] grades = new int[size];
        System.out.print("Enter " + size + "number(s)." + " Press enter after each number: ");
        for(int i = 0; i < size; i++){
            grades[i] = in.nextInt();
        }
        in.close();
        for(int i = 0; i < size; i++){
            System.out.println(grades[i]);
        }

    }
}
