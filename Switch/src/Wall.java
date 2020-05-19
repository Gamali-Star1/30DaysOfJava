public class Wall {
    private double width;
    private double height;

    public Wall(){
        this(0.0, 0.0);
    }

    public Wall(double width, double height){
        if (width < 0)
            this.width = 0;
        else if (height < 0)
            this.height = 0;
        else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width1){
        if (width1 < 0)
            this.width = 0;
        else
            this.width = width1;
    }

    public void setHeight(double height1){
        if (height1 < 0)
            this.height = 0;
        else
            this.height = height1;
    }

    public double getArea(){
        double area = this.width * this.height;
        return area;
    }
}
