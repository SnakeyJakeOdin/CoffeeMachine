public class Coffee {
    private int numCups;
    private int amountWater;
    private int amountMilk;
    private int amountBean;

    public Coffee() {

    }

    public Coffee(int amountWater, int amountMilk, int amountBean) {
        this.amountWater = amountWater;
        this.amountMilk= amountMilk;
        this.amountBean = amountBean;
    }

    public int getNumCups() {
        return this.numCups;
    }

    public void setNumCups(int numCups) {
        this.numCups = numCups;
    }

    public void printIngredients() {
        int waterPerCup = 200; // ml
        int milkPerCup = 50;   // ml
        int beansPerCup = 15;  // g

        System.out.printf("For %d cups of coffee you will need:%n", numCups);
        System.out.printf("%d ml of water%n", waterPerCup * numCups);
        System.out.printf("%d ml of milk%n", milkPerCup * numCups);
        System.out.printf("%d g of coffee beans%n", beansPerCup * numCups);
    }
}
