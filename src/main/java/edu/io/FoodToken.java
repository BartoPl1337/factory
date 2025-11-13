package edu.io;

public class FoodToken extends Token {
    public final int amount;
    public FoodToken(int amount) {
        super("FoodToken amount= " + amount);
        this.amount = amount;
    }
    public int amount() {
        return amount;
    }
}
