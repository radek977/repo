package exercise8to14;

public class Dish {

    private String name;
    private boolean vegetarian;
    private int calories;

    public Dish(String name, boolean vegetarian, int calories) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return name + " [" + vegetarian + " " + calories + " kcal]";
    }
}
