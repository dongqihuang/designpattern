package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal lunch = mealBuilder.fastFood();
        lunch.showBill();
        System.out.println("Total cost : "+lunch.getCost());

    }
}
