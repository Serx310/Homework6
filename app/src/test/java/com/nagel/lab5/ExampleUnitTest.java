package com.nagel.lab5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.nagel.lab5.room.Recipe;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    public Recipe recipe;

    @Before
    public void setup(){
        this.recipe = new Recipe("Mom\'s spaghetti", "Eminem", "Google it" , 420);
    }

    @Test
    public void checkTimeCorrect(){
        assertEquals(420, recipe.getTime());
    }
}