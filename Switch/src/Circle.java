public class Circle {
    //Instance variable or class field;
    private double radius;

    //Constructor;
    public Circle(double radius){
        this.radius = radius;
        if (radius < 0){
            this.radius = 0;
        }
    }

    //Getters for Methods;
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

}
