package com.test;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class LionExceptionTest{
    Feline feline = mock(Feline.class);
    String sex;
    boolean shouldThrow;

    public LionExceptionTest(String sex, boolean shouldThrow){
        this.sex = sex;
        this.shouldThrow = shouldThrow;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"Самец", false},
                {"Самка", false},
                {"Особь", true},
        });
    }

    @Test
    public void testExceptionInConstructor(){
        try{
            new Lion(feline, sex);
            if(shouldThrow){
                fail("Ожидается исключение");
            }
        }catch (Exception e){
            if(!shouldThrow){
                fail("Не ожидается получение исключения");
            }
        }
    }
}
