public class Pizza {
    private String size;
    private String storeName;
    private boolean hasPepperoni;
    private boolean hasSausage;
    private boolean hasMushrooms;
    private boolean hasBacon;
    private boolean hasOnions;
    private boolean hasExtraCheese;
    private boolean hasPeppers;
    private boolean hasChicken;
    private boolean hasOlives;
    private boolean hasSpinach;
    private boolean hasTomatoAndBasil;
    private boolean hasBeef;
    private boolean hasHam;
    private boolean hasPesto;
    private boolean hasSpicyPork;
    private boolean hasHamAndPineapple;

    public Pizza(String storeName, String size, boolean hasPepperoni, boolean hasSausage, boolean hasMushrooms, boolean hasBacon, 
    boolean hasOnions, boolean hasExtraCheese, boolean hasPeppers, boolean hasChicken, boolean hasOlives, 
    boolean hasSpinach, boolean hasTomatoAndBasil, boolean hasBeef, boolean hasHam, boolean hasPesto, 
    boolean hasSpicyPork, boolean hasHamAndPineapple) {
        if (size == null || size.isEmpty()) {
            throw new IllegalArgumentException("Size must be provided");
        }
        this.size = size;
        this.storeName = storeName;
        this.hasPepperoni = hasPepperoni;
        this.hasSausage = hasSausage;
        this.hasMushrooms = hasMushrooms;
        this.hasBacon = hasBacon;
        this.hasOnions = hasOnions;
        this.hasExtraCheese = hasExtraCheese;
        this.hasPeppers = hasPeppers;
        this.hasChicken = hasChicken;
        this.hasOlives = hasOlives;
        this.hasSpinach = hasSpinach;
        this.hasTomatoAndBasil = hasTomatoAndBasil;
        this.hasBeef = hasBeef;
        this.hasHam = hasHam;
        this.hasPesto = hasPesto;
        this.hasSpicyPork = hasSpicyPork;
        this.hasHamAndPineapple = hasHamAndPineapple;
    }

    public void eat() {
        System.out.println(storeName + " - " + size + " Pizza");
        System.out.println("Toppings:");
        if (hasPepperoni) System.out.println("- Pepperoni");
        if (hasSausage) System.out.println("- Sausage");
        if (hasMushrooms) System.out.println("- Mushrooms");
        if (hasBacon) System.out.println("- Bacon");
        if (hasOnions) System.out.println("- Onions");
        if (hasExtraCheese) System.out.println("- Extra Cheese");
        if (hasPeppers) System.out.println("- Peppers");
        if (hasChicken) System.out.println("- Chicken");
        if (hasOlives) System.out.println("- Olives");
        if (hasSpinach) System.out.println("- Spinach");
        if (hasTomatoAndBasil) System.out.println("- Tomato and Basil");
        if (hasBeef) System.out.println("- Beef");
        if (hasHam) System.out.println("- Ham");
        if (hasPesto) System.out.println("- Pesto");
        if (hasSpicyPork) System.out.println("- Spicy Pork");
        if (hasHamAndPineapple) System.out.println("- Ham and Pineapple");
    }
}