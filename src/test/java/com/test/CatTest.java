package com.test;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CatTest {
    Feline feline = mock(Feline.class);
    Cat cat = new Cat(feline);

    @Test
    public void getSoundTest(){
        assertEquals("Мяу",cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}
