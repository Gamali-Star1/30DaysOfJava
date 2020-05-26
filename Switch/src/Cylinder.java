public class Cylinder extends Circle {
    //class field;
    private double height;

    //Constructor;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height < 0){
            this.height = 0;
        }
    }

    //Methods;
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
