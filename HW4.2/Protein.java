public class Protein extends Macronutrient {
    public String getName() {
        return "Protein";
    }
    
}

class Fish extends Protein {
    @Override
    public String getName() {
        return "Fish";
    }
}

class Chicken extends Protein {
    @Override
    public String getName() {
        return "Chicken";
    }
}

class Beef extends Protein {
    @Override
    public String getName() {
        return "Beef";
    }
}

class Tofu extends Protein {
    @Override
    public String getName() {
        return "Tofu";
    }
}
