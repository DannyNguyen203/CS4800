public class Carbs extends Macronutrient {
    public String getName() {
        return "Carbs";
    }
}

class Cheese extends Carbs {
    @Override
    public String getName() {
        return "Cheese";
    }
}

class Bread extends Carbs {
    @Override
    public String getName() {
        return "Bread";
    }
}

class Lentils extends Carbs {
    @Override
    public String getName() {
        return "Lentils";
    }
}

class Pistachio extends Carbs {
    @Override
    public String getName() {
        return "Pistachio";
    }
}