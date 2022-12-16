public class TipCalculator {
    private int people;
    private double tipPercent;
    private double totalBillBeforeTip;

    public TipCalculator (int people, double tipPercent){
        this.people = people;
        this.tipPercent = tipPercent;
        this.totalBillBeforeTip = 0.0;
    }
    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }
    public double getTipPercentage(){
        return tipPercent;
    }
    public double addMeal(double cost){
        totalBillBeforeTip = totalBillBeforeTip + cost;
        return totalBillBeforeTip;
    }
    public double tipAmount(){
        return (double)(tipPercent * totalBillBeforeTip);
    }
    public double totalBill(){
        return totalBillBeforeTip + tipAmount();
    }
    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip / people;
    }
    public double perPersonTipAmount(){
        return tipAmount() / people;
    }
    public double perPersonTotalCost(){
        return totalBill() / people;
    }


}
