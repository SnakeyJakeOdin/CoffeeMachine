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

        if (s.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    coffeeMachine.setWater(coffeeMachine.getWater() - espresso.getWater());
                    coffeeMachine.setMilk(coffeeMachine.getMilk() - espresso.getMilk());
                    coffeeMachine.setBeans(coffeeMachine.getBeans() - espresso.getBeans());
                    coffeeMachine.setCups(coffeeMachine.getCups() - 1);
                    coffeeMachine.setMoney(coffeeMachine.getMoney() + espresso.getCost());
                    System.out.println();
                    break;
                case 2:
                    coffeeMachine.setWater(coffeeMachine.getWater() - latte.getWater());
                    coffeeMachine.setMilk(coffeeMachine.getMilk() - latte.getMilk());
                    coffeeMachine.setBeans(coffeeMachine.getBeans() - latte.getBeans());
                    coffeeMachine.setCups(coffeeMachine.getCups() - 1);
                    coffeeMachine.setMoney(coffeeMachine.getMoney() + latte.getCost());
                    System.out.println();
                    break;
                case 3:
                    coffeeMachine.setWater(coffeeMachine.getWater() - cappuccino.getWater());
                    coffeeMachine.setMilk(coffeeMachine.getMilk() - cappuccino.getMilk());
                    coffeeMachine.setBeans(coffeeMachine.getBeans() - cappuccino.getBeans());
                    coffeeMachine.setCups(coffeeMachine.getCups() - 1);
                    coffeeMachine.setMoney(coffeeMachine.getMoney() + cappuccino.getCost());
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
        else if (s.equals("fill")) {
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
        else if (s.equals("take")) {
            System.out.printf("I gave you $%d%n%n", coffeeMachine.getMoney());
            coffeeMachine.setMoney(0);
        }

        System.out.println(coffeeMachine);
    }
}