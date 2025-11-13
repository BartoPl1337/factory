package edu.io;

public class GoldToken extends Token {
    public final int amount;

    public GoldToken(int amount) {
        super("GoldToken" + amount);
        this.amount = amount;
    }

    public int amount() {
        return amount;
    }
}
