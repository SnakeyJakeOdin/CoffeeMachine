import java.util.Scanner;

public class CoffeeMachine {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create Coffee object
        Coffee coffee = new Coffee(getNumCups());

        coffee.printIngredients();
    }

    public static int getNumCups() {
        String s = "Write how many cups of coffee you will need:";
        System.out.println(s);

        int numCups = 0;
        while (true) {
            try {
                numCups = Integer.parseInt(scanner.nextLine());
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
    public static void coffeeProcess() {
        String s = """
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
                Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!""";
        System.out.println(s);
    }
}