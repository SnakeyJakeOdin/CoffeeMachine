public class Beverage extends Coffee {
    public int cost;  // dollars

    public Beverage(int water, int milk, int beans, int cost) {
        super(water, milk, beans);
        this.cost = cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String toString() {
        String s = String.format("""
                Cost: $%d
                """, cost);
        return super.toString() + s;
    }
}