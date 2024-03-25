public class LittleCaesarsBuilder {
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

    public LittleCaesarsBuilder setSize(String pizzaSize){
        this.size = pizzaSize;
        if ((!size.equalsIgnoreCase("small") && !size.equalsIgnoreCase("medium") && !size.equalsIgnoreCase("large"))) {
            throw new IllegalArgumentException("Size must be 'small', 'medium', or 'large'");
        }
        return this;
    }

    public LittleCaesarsBuilder setPepperoni(boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
        return this;
    }

    public LittleCaesarsBuilder setSausage(boolean hasSausage) {
        this.hasSausage = hasSausage;
        return this;
    }

    public LittleCaesarsBuilder setMushrooms(boolean hasMushrooms) {
        this.hasMushrooms = hasMushrooms;
        return this;
    }

    public LittleCaesarsBuilder setBacon(boolean hasBacon) {
        this.hasBacon = hasBacon;
        return this;
    }

    public LittleCaesarsBuilder setOnions(boolean hasOnions) {
        this.hasOnions = hasOnions;
        return this;
    }

    public LittleCaesarsBuilder setExtraCheese(boolean hasExtraCheese) {
        this.hasExtraCheese = hasExtraCheese;
        return this;
    }

    public LittleCaesarsBuilder setPeppers(boolean hasPeppers) {
        this.hasPeppers = hasPeppers;
        return this;
    }

    public LittleCaesarsBuilder setChicken(boolean hasChicken) {
        this.hasChicken = hasChicken;
        return this;
    }

    public LittleCaesarsBuilder setOlives(boolean hasOlives) {
        this.hasOlives = hasOlives;
        return this;
    }

    public LittleCaesarsBuilder setSpinach(boolean hasSpinach) {
        this.hasSpinach = hasSpinach;
        return this;
    }

    public LittleCaesarsBuilder setTomatoAndBasil(boolean hasTomatoAndBasil) {
        this.hasTomatoAndBasil = hasTomatoAndBasil;
        return this;
    }

    public LittleCaesarsBuilder setBeef(boolean hasBeef) {
        this.hasBeef = hasBeef;
        return this;
    }

    public LittleCaesarsBuilder setHam(boolean hasHam) {
        this.hasHam = hasHam;
        return this;
    }

    public LittleCaesarsBuilder setPesto(boolean hasPesto) {
        this.hasPesto = hasPesto;
        return this;
    }

    public LittleCaesarsBuilder setSpicyPork(boolean hasSpicyPork) {
        this.hasSpicyPork = hasSpicyPork;
        return this;
    }

    public LittleCaesarsBuilder setHamAndPineapple(boolean hasHamAndPineapple) {
        this.hasHamAndPineapple = hasHamAndPineapple;
        return this;
    }

    public Pizza build() {
        return new Pizza("Little Caesars", size, hasPepperoni, hasSausage, hasMushrooms, hasBacon, hasOnions, hasExtraCheese,
                hasPeppers, hasChicken, hasOlives, hasSpinach, hasTomatoAndBasil, hasBeef, hasHam, hasPesto,
                hasSpicyPork, hasHamAndPineapple);
    }
}
