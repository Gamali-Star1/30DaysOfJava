//1.First program with class Floor.
public class Floor {
    //Instance variable(class variables)
    private double width;
    private double length;

    //Constructors
    public Floor(double width, double length){
        this.width = width;
        this.length = length;
        if (width < 0){
            this.width = 0;
        }
        if (length < 0){
            this.length = 0;
        }
    }

    //Instance Methods
    public double getArea(){
        double area = width * length;
        return area;
    }
}

