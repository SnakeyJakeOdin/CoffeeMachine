import java.util.Scanner;

public class CoffeeMachine {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Coffee coffee = machineConfig();
        coffee.setNumCups(numCups());
        coffee.printIngredients();
    }

    public static int numCups() {
        String s = "Write how many cups of coffee you will need:";
        System.out.println(s);

        int numCups = 0;
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
            else if (numCups == 0) {
                System.out.println("ERROR: Number cannot be 0");
            }
            else {
                break;
            }
        }

        return numCups;
    }

    public static Coffee machineConfig() {
        int amountWater;
        int amountMilk;
        int amountBean;

        System.out.println("Write how many ml of water the coffee machine has:");
        amountWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        amountMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        amountBean = scanner.nextInt();

        return new Coffee(amountWater, amountMilk, amountBean);
    }
}