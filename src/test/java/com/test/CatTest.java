package com.test;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
        assertEquals(List.of(),cat.getFood());
    }
}
