public class Coffee {
    private int numCups;
    public int water;
    public int milk;
    public int beans;

    public Coffee(int water, int milk, int beans) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
    }

    public void setNumCups(int numCups) {
        this.numCups = numCups;
    }
    public void setWater(int water) {
        this.water = water;
    }
    public void setMilk(int milk) {
        this.milk = milk;
    }
    public void setBeans(int beans) {
        this.beans = beans;
    }
    public String toString() {
        String s = String.format("""
                Water: %d ml
                Milk: %d ml
                Beans: %d g
                """, water, milk, beans);
        return s;
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