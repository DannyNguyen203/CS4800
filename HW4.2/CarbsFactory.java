import java.util.Random;

public class CarbsFactory extends MacronutrientFactory{
    
    @Override
    public Carbs createItem(Customer customer){
        String mealType = customer.getMealType().toLowerCase();
        Random random = new Random();
        int randomNumber;

        switch (mealType) {
            case "norestriction":
                randomNumber = random.nextInt(4); 
                switch (randomNumber) {
                    case 0:
                        return new Cheese();
                    case 1:
                        return new Bread();
                    case 2:
                        return new Lentils();
                    case 3:
                        return new Pistachio();
                }
            case "paleo":
                return new Pistachio();
            case "vegan":
                randomNumber = random.nextInt(3); 
                switch (randomNumber) {
                    case 0:
                        return new Bread();
                    case 1:
                        return new Lentils();
                    case 2:
                        return new Pistachio();
                }
            case "nutallergy":               
                randomNumber = random.nextInt(3); 
                switch (randomNumber) {
                    case 0:
                        return new Cheese();
                    case 1:
                        return new Bread();
                    case 2:
                        return new Lentils();
                }
            default:
                throw new IllegalArgumentException("Invalid meal type");
        }
    }
}
