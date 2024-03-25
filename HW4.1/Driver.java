public class Driver {
    public static void main(String[] args) {
        // Part 1
        Pizza smallPizza = new PizzaHutBuilder()
                .setSize("small")
                .setPepperoni(true)
                .setMushrooms(true)
                .setExtraCheese(true)
                .build();
        smallPizza.eat();

        Pizza mediumPizza = new PizzaHutBuilder()
                .setSize("medium")
                .setSausage(true)
                .setOnions(true)
                .setPeppers(true)
                .setOlives(true)
                .setSpinach(true)
                .setTomatoAndBasil(true)
                .build();
        mediumPizza.eat();

        Pizza largePizza = new PizzaHutBuilder()
                .setSize("large")
                .setPepperoni(true)
                .setBacon(true)
                .setChicken(true)
                .setBeef(true)
                .setHam(true)
                .setPesto(true)
                .setSpicyPork(true)
                .setHamAndPineapple(true)
                .setExtraCheese(true)
                .build();
        largePizza.eat();     
        System.out.println();



        // Part 2

        Pizza pizza1 = new PizzaHutBuilder()
            .setSize("large")
            .setPepperoni(true)
            .setSausage(true)
            .setMushrooms(true)
            .build();
            
        Pizza pizza2 = new PizzaHutBuilder()
            .setSize("small")
            .setPepperoni(true)
            .setSausage(true)
            .build();


        Pizza pizza3 = new LittleCaesarsBuilder()
            .setSize("medium")
            .setPepperoni(true)
            .setSausage(true)
            .setMushrooms(true)
            .setBacon(true)
            .setOnions(true)
            .setExtraCheese(true)
            .setOlives(true)
            .setBeef(true)
            .build();


        Pizza pizza4 = new LittleCaesarsBuilder()
            .setSize("small")
            .setPepperoni(true)
            .setSausage(true)
            .setMushrooms(true)
            .setBacon(true)
            .setOnions(true)
            .setBeef(true)
            .build();

        Pizza pizza5 = new DominosBuilder()
            .setSize("small")
            .setPepperoni(true)
            .build();

        Pizza pizza6 = new DominosBuilder()
            .setSize("large")
            .setPepperoni(true)
            .setSausage(true)
            .setMushrooms(true)
            .build();


        pizza1.eat();
        pizza2.eat();
        pizza3.eat();
        pizza4.eat();
        pizza5.eat();
        pizza6.eat();
    }
}
