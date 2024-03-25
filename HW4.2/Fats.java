public class Fats extends Macronutrient {
    @Override
    public String getName() {
        return "Fats";
    }
}

class Avocado extends Fats {
    @Override
    public String getName() {
        return "Avocado";
    }
}

class SourCream extends Fats {
    @Override
    public String getName() {
        return "SourCream";
    }
}

class Tuna extends Fats {
    @Override
    public String getName() {
        return "Tuna";
    }
}

class Peanuts extends Fats {
    @Override
    public String getName() {
        return "Peanuts";
    }
}
