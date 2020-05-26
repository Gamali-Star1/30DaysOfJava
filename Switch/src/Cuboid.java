public class Cuboid extends Rectangle {
    //Instance variable;
    private double height;

    //Constructor;
    public Cuboid(double width, double length, double height){
        super(width,length);
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
        return getArea() * getHeight();
    }
}
