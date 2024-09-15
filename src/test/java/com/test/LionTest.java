package com.test;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class LionTest {
    Feline feline = mock(Feline.class);
    Lion lion;
    boolean expectedMane;

    public LionTest(String sex, boolean expectedMane) throws Exception {
        this.lion = new Lion(feline, sex);
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Особь", false},
        });
    }

    @Test
    public void getKittensTest(){
        int kittens = lion.getKittens();
        assertEquals(0,kittens);
    }

    @Test
    public void doesHaveManeTest(){
        boolean mane = lion.doesHaveMane();
        assertEquals(expectedMane,mane);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> food = lion.getFood();
        assertNotNull(food);
    }
}
