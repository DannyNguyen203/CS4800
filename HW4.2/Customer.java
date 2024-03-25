public class Customer {
    private String name;
    private String mealType;

    Customer(String name, String mealType){
        this.name = name;
        this.mealType = mealType;
    }


    public void setName(String newName){
        this.name = newName;
    }
    public void setMealType(String newMealType){
        this.mealType = newMealType;
    }
    public String getName(){
        return name;
    }
    public String getMealType(){
        return mealType;
    }
}
