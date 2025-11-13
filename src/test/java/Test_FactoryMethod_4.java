import edu.io.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

public class Test_FactoryMethod_4 {
    @Test
    void GoldToken_can_create() {
        TokenFactory factory = new TokenFactory();
        Token gold = factory.createGoldToken(5);
        GoldToken goldToken = (GoldToken) gold;
        Assertions.assertEquals(5, goldToken.amount());
    }

    @Test
    void FoodToken_can_create() {
        TokenFactory factory = new TokenFactory();
        Token food = factory.createFoodToken(5);
        FoodToken foodToken = (FoodToken) food;
        Assertions.assertEquals(5, foodToken.amount());
    }

    @Test
    void ShovelToken_can_create() {
        TokenFactory factory = new TokenFactory();
        Token shovel = factory.createShovelToken(5);
        ShovelToken s = (ShovelToken) shovel;
        Assertions.assertEquals(5, s.durability());
    }

    @Test
    void EmptyToken_Instance() {
        TokenFactory factory = new TokenFactory();
        Token empty1 = factory.createEmptyToken();
        Token empty2 = factory.createEmptyToken();
        Assertions.assertSame(empty1, empty2);
    }

    @Test
    void is_food_instance() {
        TokenFactory factory = new TokenFactory();
        FoodToken food1 = (FoodToken) factory.createFoodToken(2);
        FoodToken food2 = (FoodToken) factory.createFoodToken(2);
        Assertions.assertSame(food1, food2);
    }

    @Test
    void is_gold_instance() {
        TokenFactory factory = new TokenFactory();
        GoldToken gold1 = (GoldToken) factory.createGoldToken(2);
        GoldToken gold2 = (GoldToken) factory.createGoldToken(2);
        Assertions.assertSame(gold1, gold2);
    }
}
