public class PizzaHutBuilder {
    private String size;
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

    public PizzaHutBuilder setSize(String pizzaSize){
        this.size = pizzaSize;
        if ((!size.equalsIgnoreCase("small") && !size.equalsIgnoreCase("medium") && !size.equalsIgnoreCase("large"))) {
            throw new IllegalArgumentException("Size must be 'small', 'medium', or 'large'");
        }
        return this;
    }

    public PizzaHutBuilder setPepperoni(boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
        return this;
    }

    public PizzaHutBuilder setSausage(boolean hasSausage) {
        this.hasSausage = hasSausage;
        return this;
    }

    public PizzaHutBuilder setMushrooms(boolean hasMushrooms) {
        this.hasMushrooms = hasMushrooms;
        return this;
    }

    public PizzaHutBuilder setBacon(boolean hasBacon) {
        this.hasBacon = hasBacon;
        return this;
    }

    public PizzaHutBuilder setOnions(boolean hasOnions) {
        this.hasOnions = hasOnions;
        return this;
    }

    public PizzaHutBuilder setExtraCheese(boolean hasExtraCheese) {
        this.hasExtraCheese = hasExtraCheese;
        return this;
    }

    public PizzaHutBuilder setPeppers(boolean hasPeppers) {
        this.hasPeppers = hasPeppers;
        return this;
    }

    public PizzaHutBuilder setChicken(boolean hasChicken) {
        this.hasChicken = hasChicken;
        return this;
    }

    public PizzaHutBuilder setOlives(boolean hasOlives) {
        this.hasOlives = hasOlives;
        return this;
    }

    public PizzaHutBuilder setSpinach(boolean hasSpinach) {
        this.hasSpinach = hasSpinach;
        return this;
    }

    public PizzaHutBuilder setTomatoAndBasil(boolean hasTomatoAndBasil) {
        this.hasTomatoAndBasil = hasTomatoAndBasil;
        return this;
    }

    public PizzaHutBuilder setBeef(boolean hasBeef) {
        this.hasBeef = hasBeef;
        return this;
    }

    public PizzaHutBuilder setHam(boolean hasHam) {
        this.hasHam = hasHam;
        return this;
    }

    public PizzaHutBuilder setPesto(boolean hasPesto) {
        this.hasPesto = hasPesto;
        return this;
    }

    public PizzaHutBuilder setSpicyPork(boolean hasSpicyPork) {
        this.hasSpicyPork = hasSpicyPork;
        return this;
    }

    public PizzaHutBuilder setHamAndPineapple(boolean hasHamAndPineapple) {
        this.hasHamAndPineapple = hasHamAndPineapple;
        return this;
    }

    public Pizza build() {
        return new Pizza("Pizza Hut", size, hasPepperoni, hasSausage, hasMushrooms, hasBacon, hasOnions, hasExtraCheese,
                hasPeppers, hasChicken, hasOlives, hasSpinach, hasTomatoAndBasil, hasBeef, hasHam, hasPesto,
                hasSpicyPork, hasHamAndPineapple);
    }
}
