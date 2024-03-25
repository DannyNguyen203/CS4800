import java.util.Random;

public class ProteinFactory extends MacronutrientFactory{
    public Protein createItem(Customer customer){
        String mealType = customer.getMealType().toLowerCase();
        Random random = new Random();
        int randomNumber;

        switch (mealType) {
            case "norestriction":
                randomNumber = random.nextInt(4); 
                switch (randomNumber) {
                    case 0:
                        return new Fish();
                    case 1:
                        return new Chicken();
                    case 2:
                        return new Beef();
                    case 3:
                        return new Tofu();
                }
            case "paleo":
                randomNumber = random.nextInt(3); 
                switch (randomNumber) {
                    case 0:
                        return new Fish();
                    case 1:
                        return new Chicken();
                    case 2:
                        return new Beef();
                }
            case "vegan":
                return new Tofu();
            case "nutallergy":               
                randomNumber = random.nextInt(4); 
                switch (randomNumber) {
                    case 0:
                        return new Fish();
                    case 1:
                        return new Chicken();
                    case 2:
                        return new Beef();
                    case 3:
                        return new Tofu();
                }
            default:
                throw new IllegalArgumentException("Invalid meal type");
        }
    }
    
}
