package exercise8to14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishMain {

    public static void main(String[] args) {

        List<Dish> dishes = Arrays.asList(
                new Dish("Burger", false, 999),
                new Dish("Pizza(SalamiMala)", false, 499),
                new Dish("VegeBurger", true, 617),
                new Dish("Stek(300g)", false, 721),
                new Dish("Pizza(4-Sery)", true, 800)
        );

        List<Dish> byCalories = sortByCalories(dishes);
        byCalories.forEach(System.out::println);
        System.out.println("Nazwy dań: ");
        dishNames(dishes).forEach(System.out::println);
        int totalCalories = allCalories(dishes);
        System.out.println("Kalorie razem: "+totalCalories);
        System.out.println("Dania wegańskie: ");
        veganDishes(dishes).forEach(System.out::println);
        System.out.println("Najbardziej kaloryczne dania: ");
        topCaloricDishes(dishes, 3).forEach(System.out::println);
        System.out.println("Wszystkie dania referencja: ");
        dishList(dishes);
        System.out.println("Danie z kalorie > 500: ");
        highCaloricDishes(dishes).forEach(System.out::println);
    }

    public static List<Dish> sortByCalories(List<Dish> dishes) {
        return dishes.stream()
                .sorted(Comparator.comparingInt(Dish::getCalories))
                .collect(Collectors.toList());
    }

    public static List<String> dishNames(List<Dish> dishes) {
        return dishes.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());
    }

    public static int allCalories(List<Dish> dishes) {
        return dishes.stream()
                .mapToInt(Dish::getCalories)
                .sum();
    }

    public static List<Dish> veganDishes(List<Dish> dishes) {
        return dishes.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
    }

    public static List<Dish> topCaloricDishes(List<Dish> dishes, int n) {
        return dishes.stream()
                .sorted(Comparator.comparingInt(Dish::getCalories).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static void dishList(List<Dish> dishes) {
        dishes.forEach(System.out::println);
    }

    public static List<Dish> highCaloricDishes(List<Dish> dishes) {
        return dishes.stream()
                .filter(d -> d.getCalories() > 500)
                .sorted(Comparator.comparingInt(Dish::getCalories))
                .collect(Collectors.toList());
    }
}
