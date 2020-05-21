
public class Point {
    //Class fields or instance variables
    private int x;
    private int y;

    //Constructors
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Instance Methods with Getters and Setters.
    //1.Getters
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    //2.Setters
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    //Other Methods
    public double distance(){
        double s = Math.sqrt((getX()*getX()) + (getY()*getY()));
        return s;
    }
    public double distance(int x, int y){
        double s = Math.sqrt(((this.x - x)*(this.x - x)) + ((this.y - y)*(this.y - y)));
        return s;
    }

    public double distance(Point another){
        double s =
                Math.sqrt(((another.x)*(another.x)) + ((another.y )*(another.y)));
        return s;
    }
}
