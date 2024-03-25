public class MealBuilder {
    public static void main(String[] args){
        Customer[] customers = {
            new Customer("John", "NoRestriction"),
            new Customer("Alice", "Paleo"),
            new Customer("Bob", "Vegan"),
            new Customer("Emily", "NutAllergy"),
            new Customer("Mike", "NoRestriction"),
            new Customer("Sarah", "Paleo")
        };


        for (Customer customer : customers){
            createMealPlan(customer);
        }


    }

    public static void createMealPlan(Customer customer){
        MacronutrientFactory carbsFactory =  new CarbsFactory();
        MacronutrientFactory proteinFactory =  new ProteinFactory();
        MacronutrientFactory fatsFactory =  new FatFactory();

        Macronutrient carb = carbsFactory.createItem(customer);
        Macronutrient protein = proteinFactory.createItem(customer);
        Macronutrient fats = fatsFactory.createItem(customer);

        System.out.println("Customer : " + customer.getName() + ", Diet Plan: " + customer.getMealType() + "\n");
        System.out.println("Carbs: " + carb.getName() + "\n");
        System.out.println("Protein: " + protein.getName() + "\n");
        System.out.println("Fats: " + fats.getName() + "\n\n");
    }


}
