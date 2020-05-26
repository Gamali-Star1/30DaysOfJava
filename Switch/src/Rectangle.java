public class Rectangle {
    //Instance variables;
    private double width;
    private double length;

    //Constructor;
    public Rectangle(double width, double length){
        //Initialization
        this.width = width;
        this.length = length;
        if (width < 0){
            this.width = 0;
        }
        if (length < 0){
            this.length = 0;
        }
    }

    //Methods;
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return getWidth() * getLength();
    }
}
