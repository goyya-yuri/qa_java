package com.test;

import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception{
            List<String> food = feline.eatMeat();
            assertEquals(List.of("Животные", "Птицы", "Рыба"),food);
    }

    @Test
    public void getFamilyTest(){
        String family = feline.getFamily();
        assertEquals("Кошачьи",family);
    }

    @Test
    public void getKittensTest(){
        int kittens = feline.getKittens();
        assertEquals(1,kittens);
    }

    @Test
    public void getKittensCountTest(){
        int expected = 2;
        int actual = feline.getKittens(expected);
        assertEquals(expected,actual);
    }
}
