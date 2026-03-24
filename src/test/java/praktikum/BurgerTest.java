package praktikum;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class BurgerTest {
    private Burger burger;

    @Mock
    private Bun bun;

    @Mock
    private Ingredient ingredientSous;

    @Mock
    private Ingredient ingredientFilling;

    // Создать бургер (выполняем для каждого теста)
    @Before
    public void setUp() {
        burger = new Burger();
    }

    // Тест положить булку для бургера
    @Test
    public void setBunsTest() {
        burger.setBuns(bun); // Добавили булку
        Assert.assertEquals("Ожидаем другую булку", bun, burger.bun ); // Проверяем что булка добавилась
    }

    // Тест добавить ингредиент в бургер
    @Test
    public void addIngredientTest() {
        burger.addIngredient(ingredientSous); // Добавили ингредиент
        Assert.assertEquals("Ожидаем другой ингредиент", List.of(ingredientSous), burger.ingredients); // Проверяем что ингредиент добавился
    }

    // Тест удалить ингредиент из бургера
    @Test
    public void removeIngredientTest() {
        burger.addIngredient(ingredientFilling); // Добавили ингредиент
        burger.removeIngredient(0); // Удалили ингредиент
        Assert.assertTrue("Ингредиент не удалили", burger.ingredients.isEmpty()); // Проверяем что ингредиент удалился
    }

}
