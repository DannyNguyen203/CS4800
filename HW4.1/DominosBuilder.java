public class DominosBuilder {
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

    public DominosBuilder setSize(String pizzaSize){
        this.size = pizzaSize;
        if ((!size.equalsIgnoreCase("small") && !size.equalsIgnoreCase("medium") && !size.equalsIgnoreCase("large"))) {
            throw new IllegalArgumentException("Size must be 'small', 'medium', or 'large'");
        }
        return this;
    }

    public DominosBuilder setPepperoni(boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
        return this;
    }

    public DominosBuilder setSausage(boolean hasSausage) {
        this.hasSausage = hasSausage;
        return this;
    }

    public DominosBuilder setMushrooms(boolean hasMushrooms) {
        this.hasMushrooms = hasMushrooms;
        return this;
    }

    public DominosBuilder setBacon(boolean hasBacon) {
        this.hasBacon = hasBacon;
        return this;
    }

    public DominosBuilder setOnions(boolean hasOnions) {
        this.hasOnions = hasOnions;
        return this;
    }

    public DominosBuilder setExtraCheese(boolean hasExtraCheese) {
        this.hasExtraCheese = hasExtraCheese;
        return this;
    }

    public DominosBuilder setPeppers(boolean hasPeppers) {
        this.hasPeppers = hasPeppers;
        return this;
    }

    public DominosBuilder setChicken(boolean hasChicken) {
        this.hasChicken = hasChicken;
        return this;
    }

    public DominosBuilder setOlives(boolean hasOlives) {
        this.hasOlives = hasOlives;
        return this;
    }

    public DominosBuilder setSpinach(boolean hasSpinach) {
        this.hasSpinach = hasSpinach;
        return this;
    }

    public DominosBuilder setTomatoAndBasil(boolean hasTomatoAndBasil) {
        this.hasTomatoAndBasil = hasTomatoAndBasil;
        return this;
    }

    public DominosBuilder setBeef(boolean hasBeef) {
        this.hasBeef = hasBeef;
        return this;
    }

    public DominosBuilder setHam(boolean hasHam) {
        this.hasHam = hasHam;
        return this;
    }

    public DominosBuilder setPesto(boolean hasPesto) {
        this.hasPesto = hasPesto;
        return this;
    }

    public DominosBuilder setSpicyPork(boolean hasSpicyPork) {
        this.hasSpicyPork = hasSpicyPork;
        return this;
    }

    public DominosBuilder setHamAndPineapple(boolean hasHamAndPineapple) {
        this.hasHamAndPineapple = hasHamAndPineapple;
        return this;
    }

    public Pizza build() {
        return new Pizza("Dominos", size, hasPepperoni, hasSausage, hasMushrooms, hasBacon, hasOnions, hasExtraCheese,
                hasPeppers, hasChicken, hasOlives, hasSpinach, hasTomatoAndBasil, hasBeef, hasHam, hasPesto,
                hasSpicyPork, hasHamAndPineapple);
    }
}
