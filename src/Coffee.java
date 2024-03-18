public class Coffee {
    public int water;
    public int milk;
    public int beans;

    public Coffee(int water, int milk, int beans) {
        this.water = water;
        this.milk = milk;
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
    public void setWater(int water) {
        this.water = water;
    }
    public void setMilk(int milk) {
        this.milk = milk;
    }
    public void setBeans(int beans) {
        this.beans = beans;
    }
}
