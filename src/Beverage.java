public class Beverage extends Coffee {
    private int numCups;
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

    public int checkSupplies() {
        final int waterPerCup = 200; // ml
        final int milkPerCup = 50;   // ml
        final int beansPerCup = 15;  // g

        int waterRatio = water / waterPerCup;
        int milkRatio = milk / milkPerCup;
        int beanRatio = beans / beansPerCup;

        // water limiting factor
        int limitingFactor;
        if (waterRatio <= milkRatio && waterRatio <= beanRatio) {
            limitingFactor = waterRatio;
        }
        // milk limiting factor
        else if (milkRatio <= waterRatio &&  milkRatio <= beanRatio) {
            limitingFactor = milkRatio;
        }
        // bean limiting factor
        else {
            limitingFactor = beanRatio;
        }
        return limitingFactor;
    }

    public void printAvailability (int limitingFactor) {
        if (limitingFactor == numCups) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (limitingFactor > numCups) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)",
                    limitingFactor - numCups);
        }
        else {
            System.out.printf("No, I can only make %d cup(s) of coffee", limitingFactor);
        }
    }
}