import java.util.Random;

public class FatFactory extends MacronutrientFactory{

    @Override
    public Fats createItem(Customer customer){
        String mealType = customer.getMealType().toLowerCase();
        Random random = new Random();
        int randomNumber;

        switch (mealType) {
            case "norestriction":
                randomNumber = random.nextInt(4); 
                switch (randomNumber) {
                    case 0:
                        return new Avocado();
                    case 1:
                        return new SourCream();
                    case 2:
                        return new Tuna();
                    case 3:
                        return new Peanuts();
                }
            case "paleo":
                randomNumber = random.nextInt(3); 
                switch (randomNumber) {
                    case 0:
                        return new Avocado();
                    case 1:
                        return new Tuna();
                    case 2:
                        return new Peanuts();
                }
            case "vegan":
                randomNumber = random.nextInt(2); 
                switch (randomNumber) {
                    case 0:
                        return new Avocado();
                    case 1:
                        return new Peanuts();
                }
            case "nutallergy":               
                randomNumber = random.nextInt(3); 
                switch (randomNumber) {
                    case 0:
                        return new Avocado();
                    case 1:
                        return new Tuna();
                    case 2:
                        return new SourCream();
                }
            default:
                throw new IllegalArgumentException("Invalid meal type");
        }
    }
}
