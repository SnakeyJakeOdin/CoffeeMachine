public class CoffeeMachine {
    public static void main(String[] args) {
        // Create Coffee object
        Coffee coffee = new Coffee(5);

        coffee.printIngredients();
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