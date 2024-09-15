package com.test;

import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void felineEatMeatTest() throws Exception{
            List<String> food = feline.eatMeat();
            assertEquals(List.of("Животные", "Птицы", "Рыба"),food);
    }

    @Test
    public void felineGetFamilyTest(){
        String family = feline.getFamily();
        assertEquals("Кошачьи",family);
    }

    @Test
    public void felineGetKittensTest(){
        int kittens = feline.getKittens();
        assertEquals(1,kittens);
    }

    @Test
    public void felineGetKittensCountTest(){
        int expected = 2;
        int actual = feline.getKittens(expected);
        assertEquals(expected,actual);
    }
}
