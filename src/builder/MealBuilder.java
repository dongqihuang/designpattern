package builder;

public class MealBuilder {
    public Meal fastFood(){
        Meal meal = new Meal();
        meal.addItem(new ChikenBurger());
        meal.addItem(new Coco());
        return meal;
    }
}
