package edu.io;

import java.util.HashMap;
import java.util.Map;

public class FoodToken extends Token {
    public final int amount;

    public FoodToken(int amount) {
        super("FoodToken amount= " + amount);
        this.amount = amount;
    }

    public int amount() {
        return amount;
    }

    private static final Map<Integer, FoodToken> pool = new HashMap<>();

    public static FoodToken getInstance(int amount) {
        return pool.computeIfAbsent(amount, k -> new FoodToken(amount));
    }
}
