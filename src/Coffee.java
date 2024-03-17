public class Coffee {
    private int numCups;
    public int amountWater;
    public int amountMilk;
    public int amountBean;

    public Coffee(int amountWater, int amountMilk, int amountBean) {
        this.amountWater = amountWater;
        this.amountMilk= amountMilk;
        this.amountBean = amountBean;
    }

    public void setNumCups(int numCups) {
        this.numCups = numCups;
    }

    public int checkSupplies() {
        final int waterPerCup = 200; // ml
        final int milkPerCup = 50;   // ml
        final int beansPerCup = 15;  // g

        int waterRatio = amountWater / waterPerCup;
        int milkRatio = amountMilk / milkPerCup;
        int beanRatio = amountBean / beansPerCup;

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