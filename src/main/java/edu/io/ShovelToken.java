package edu.io;

public class ShovelToken extends Token {
    public final int durability;

    public ShovelToken(int durability) {
        super("ShovelToken" + durability);
        this.durability = durability;
    }

    public int durability() {
        return durability;
    }
}
