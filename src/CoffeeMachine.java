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

        System.out.println(coffeeMachine);
        System.out.println("\nWrite action (buy, fill, take):");
        s = scanner.nextLine();

        if ("buy".equals(s)) {
            buyCoffee(coffeeMachine, espresso, latte, cappuccino);
        }
        else if ("fill".equals(s)) {
            fillMachine(coffeeMachine);
        }
        else if ("take".equals(s)) {
            System.out.printf("I gave you $%d%n%n", coffeeMachine.getMoney());
            coffeeMachine.setMoney(0);
        }

        System.out.println(coffeeMachine);
    }

    public static void buyCoffee(Machine coffeeMachine, Beverage espresso, Beverage latte, Beverage cappuccino) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                updateMachine(coffeeMachine, espresso);
                break;
            case 2:
                updateMachine(coffeeMachine, latte);
                break;
            case 3:
                updateMachine(coffeeMachine, cappuccino);
                break;
            default:
                break;
        }
    }

    public static void updateMachine(Machine coffeeMachine, Beverage beverage) {
        coffeeMachine.setWater(coffeeMachine.getWater() - beverage.getWater());
        coffeeMachine.setMilk(coffeeMachine.getMilk() - beverage.getMilk());
        coffeeMachine.setBeans(coffeeMachine.getBeans() - beverage.getBeans());
        coffeeMachine.setCups(coffeeMachine.getCups() - 1);
        coffeeMachine.setMoney(coffeeMachine.getMoney() + beverage.getCost());
        System.out.println();
    }

    public static void fillMachine(Machine coffeeMachine) {
        System.out.println("Write how many ml of water you want to add:");
        coffeeMachine.setWater(coffeeMachine.getWater() + scanner.nextInt());
        System.out.println("Write how many ml of milk you want to add:");
        coffeeMachine.setMilk(coffeeMachine.getMilk() + scanner.nextInt());
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeMachine.setBeans(coffeeMachine.getBeans() + scanner.nextInt());
        System.out.println("Write how many disposable cups you want to add:");
        coffeeMachine.setCups(coffeeMachine.getCups() + scanner.nextInt());
        System.out.println();
    }
}