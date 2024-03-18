import java.util.Scanner;

public class CoffeeMachine {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create coffee machine and beverages
        Machine coffeeMachine = new Machine(400, 540, 120, 9, 550);
        Beverage espresso =     new Beverage(250, 0, 16, 4);
        Beverage latte =        new Beverage(350, 75, 20, 7);
        Beverage cappuccino =   new Beverage(200, 100, 12, 6);

        // Menu
        String s;
        int n;

        System.out.println(coffeeMachine.toString());
        System.out.println("\nWrite action (buy, fill, take):");
        s = scanner.nextLine();

        if (s.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    coffeeMachine.setWater(coffeeMachine.getWater() - espresso.getWater());
                    coffeeMachine.setMilk(coffeeMachine.getMilk() - espresso.getMilk());
                    coffeeMachine.setBeans(coffeeMachine.getBeans() - espresso.getBeans());
                    System.out.println();
                    break;
                case 2:
                    coffeeMachine.setWater(coffeeMachine.getWater() - latte.getWater());
                    coffeeMachine.setMilk(coffeeMachine.getMilk() - latte.getMilk());
                    coffeeMachine.setBeans(coffeeMachine.getBeans() - latte.getBeans());
                    System.out.println();
                    break;
                case 3:
                    coffeeMachine.setWater(coffeeMachine.getWater() - cappuccino.getWater());
                    coffeeMachine.setMilk(coffeeMachine.getMilk() - cappuccino.getMilk());
                    coffeeMachine.setBeans(coffeeMachine.getBeans() - cappuccino.getBeans());
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
        else if (s.equals("fill")) {
            //TODO: implement filling logic
            System.out.println("FILL");
        }
        else if (s.equals("take")) {
            //TODO: implement take logic
            System.out.println("TAKE");
        }
        System.out.println(coffeeMachine.toString());
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