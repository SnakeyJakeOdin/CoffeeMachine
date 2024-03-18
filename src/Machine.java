public class Machine extends Coffee{

    private int cups;
    private int money;
    public Machine(int water, int milk, int beans, int cost, int cups, int money) {
        super(water, milk, beans);
        this.cups = cups;
        this.money = money;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public String toString() {
        String s = String.format("""
                Cups: %d
                Money: $%d
                """, cups, money);
        return super.toString() + s;
    }

}
