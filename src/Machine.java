public class Machine extends Coffee{

    private int amountCups;
    private int amountMoney;
    public Machine(int amountWater, int amountMilk, int amountBean, int amountCups, int amountMoney) {
        super(amountWater, amountMilk, amountBean);
        this.amountCups = amountCups;
        this.amountMoney = amountMoney;
    }

    public void setAmountCups(int amountCups) {
        this.amountCups = amountCups;
    }
    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }
    public String toString() {
        String s = String.format("""
                Cups: %d
                Money: $%d""", amountCups, amountMoney);
        return super.toString() + s;
    }

}
