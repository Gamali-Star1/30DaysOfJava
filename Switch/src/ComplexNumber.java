
public class ComplexNumber {
    //Instance Variables or class fields
    private double real;
    private double imaginary;

    //Constructor;
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    //Getters;
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }

    //Other Methods;
    public void add(double real, double imaginary){
        this.real += getReal();
        this.imaginary += getImaginary();
    }
    public void add(ComplexNumber parameter){
        double sum = (parameter.getReal() + parameter.getImaginary()) + (this.real + this.imaginary);
    }
    public void subtract(double real, double imaginary){
        double sub = this.real - this.imaginary;
    }
    public void subtract(ComplexNumber other){
        double sub = other.getReal() - other.getImaginary();
    }

}
