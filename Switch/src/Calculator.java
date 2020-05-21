public class Calculator {
    //Instance variables
    private Floor floor;
    private Carpet carpet;

    //Constructor
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    //Instance Method
    public double getTotalCost(){
        double totalCost = this.floor.getArea()*this.carpet.getCost();
        return totalCost;
    }
}
