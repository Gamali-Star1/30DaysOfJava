//A program to print square star

public class Main {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    //A Method which prints square star after execution
    public static void printSquareStar(int number){
        int rowCount = number;
        if (number < 5){
            System.out.print("Invalid Value");
        }else {
            for(int row = 1; row <= number; row++){
                int rowNumber = row;
                for(int column = 1; column <= number; column++){
                    int columnNumber = column;
                    int currentRow = rowNumber;
                    if ((row == 1) || (row == number) || (column == 1) || (column == number) || (rowNumber == columnNumber) || (columnNumber == ((rowCount - currentRow) + 1))){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }System.out.println();
            }

        }
    }
}