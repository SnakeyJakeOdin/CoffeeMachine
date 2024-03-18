import java.util.Scanner;

public class CoffeeMachine {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create coffee machine
        Machine coffeeMachine = new Machine(400, 540, 120,
                9, 550);
        System.out.println(coffeeMachine.toString());

        // Menu
        String s;
        while (true) {
            s = scanner.nextLine();
            if (s.equals("buy")) {
                //TODO: implement buying logic
                System.out.println("BUY");
            }
            else if (s.equals("fill")) {
                //TODO: implement filling logic
                System.out.println("FILL");
            }
            else if (s.equals("take")) {
                //TODO: implement take logic
                System.out.println("TAKE");
            }
            else {
                break;
            }
        }
    }

    public static int numCups() {
        String s = "Write how many cups of coffee you will need:";
        System.out.println(s);

        int numCups;
        while (true) {
            try {
                numCups = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("ERROR: Please enter a number");
                continue;
            }
            if (numCups < 0) {
                System.out.println("ERROR: Number cannot be negative");
            }
            else break;
        }

        return numCups;
    }

    public static Coffee machineConfig() {
        int amountWater;
        int amountMilk;
        int amountBean;
        int amountCups;

        System.out.println("Write how many ml of water the coffee machine has:");
        amountWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        amountMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        amountBean = scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add");
        amountCups = scanner.nextInt();

        return new Coffee(amountWater, amountMilk, amountBean);
    }
}