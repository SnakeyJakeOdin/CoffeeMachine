public class Coffee {
    public int water; // ml
    public int milk;  // ml
    public int beans; // g

    public Coffee(int water, int milk, int beans) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
    }

    public String toString() {
        String s = String.format("""
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                """, water, milk, beans);
        return s;
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
    public int getWater() {
        return this.water;
    }
    public int getMilk() {
        return this.milk;
    }
    public int getBeans() {
        return this.beans;
    }
}
