public class Machine extends Coffee{

    private int cups;  // unit
    private int money; // dollars
    public Machine(int water, int milk, int beans, int cups, int money) {
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
    public int getCups() {
        return this.cups;
    }
    public int getMoney() {
        return this.money;
    }
    public String toString() {
        String begin = String.format("The coffee machine has:%n");
        String end = String.format("""
                %d disposable cups
                $%d of money""", cups, money);
        return begin + super.toString() + end;
    }

}
