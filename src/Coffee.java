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
        final int waterPerCup = 200; // ml
        final int milkPerCup = 50;   // ml
        final int beansPerCup = 15;  // g

        System.out.printf("For %d cups of coffee you will need:%n", numCups);
        System.out.printf("%d ml of water%n", waterPerCup * numCups);
        System.out.printf("%d ml of milk%n", milkPerCup * numCups);
        System.out.printf("%d g of coffee beans%n", beansPerCup * numCups);
    }

    public void checkSupplies() {
        final int waterPerCup = 200; // ml
        final int milkPerCup = 50;   // ml
        final int beansPerCup = 15;  // g

        int waterRatio = amountWater / waterPerCup;
        int milkRatio = amountMilk / milkPerCup;
        int beanRatio = amountBean / beansPerCup;

        System.out.printf("Water Ratio :%d%nMilk Ratio :%d%nBean Ratio: %d%n", waterRatio, milkRatio, beanRatio);


    }
}
