public class Wall {
    //Class variables
    private double width;
    private double height;

    //Constructors
    public Wall(){
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if (width < 0){
            this.width = 0;
        }
        if (height < 0){
            this.height = 0;
        }
    }

    //Getters
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    //Setters
    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }



    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

        //Extra Methods
    public double getArea(){
        double area = this.width * this.height;
        return area;
    }
}
