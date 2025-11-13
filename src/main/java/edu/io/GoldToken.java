package edu.io;

import java.util.HashMap;
import java.util.Map;

public class GoldToken extends Token {
    public final int amount;

    public GoldToken(int amount) {
        super("GoldToken" + amount);
        this.amount = amount;
    }

    public int amount() {
        return amount;
    }

    private static final Map<Integer, GoldToken> pool = new HashMap<>();

    public static GoldToken getInstance(int amount) {
        return pool.computeIfAbsent(amount, k -> new GoldToken(amount));
    }
}
