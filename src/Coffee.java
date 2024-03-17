public class Coffee {
    private int numCups;

    public Coffee(int numCups) {
        this.numCups = numCups;
    }

    public int getNumCups() {
        return this.numCups;
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
