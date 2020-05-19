public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber1){
        this.firstNumber = firstNumber1;
    }
    public double getFirstNumber(){
        return firstNumber;
    }

    public void setSecondNumber(double secondNumber1){
        this.secondNumber = secondNumber1;
    }
    public double getSecondNumber(){
        return secondNumber;
    }

    public double getAdditionResult(){
        double result = firstNumber + secondNumber;
        return result;
    }

    public double getSubtractionResult(){
        double result = firstNumber - secondNumber;
        return result;
    }

    public double getMultiplicationResult(){
        double result = firstNumber * secondNumber;
        return result;
    }

    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }else {
            double result = firstNumber/secondNumber;
            return result;
        }
    }

}
