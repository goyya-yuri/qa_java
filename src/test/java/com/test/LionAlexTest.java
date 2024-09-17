package com.test;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class LionAlexTest {
    Feline feline = mock(Feline.class);
    LionAlex lion = new LionAlex(feline);

    public LionAlexTest() throws Exception {
    }

    @Test
    public void getFriendsTest(){
        assertEquals(List.of("Марти", "Глория", "Мелман"),lion.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest(){
        assertEquals("Нью-Йоркский зоопарк",lion.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest(){
        assertEquals(0,lion.getKittens());
    }
}
