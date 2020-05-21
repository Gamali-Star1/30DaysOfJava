public class Carpet{
    //Instance variable
    private double cost;

    //Constructor
    public Carpet(double cost){
        this.cost = cost;
        if (cost < 0){
            this.cost = 0;
        }
    }
    //Instance Method
    public double getCost(){
        return cost;
    }
}
