package edu.io;

public class TokenFactory {
    public static Token createEmptyToken() {
        return new EmptyToken();
    }

    public static Token createGoldToken() {
        return createGoldToken(1000);
    }

    public static Token createGoldToken(int amount) {
        return new GoldToken(amount);
    }

    public static Token createFoodToken() {
        return createFoodToken(10);
    }

    public static Token createFoodToken(int amount) {
        return new FoodToken(amount);
    }

    public static Token createShovelToken() {
        return createShovelToken(100);
    }

    public static Token createShovelToken(int durability) {
        return new ShovelToken(durability);
    }
}
