package com.kaelzhang.kata;

import org.junit.jupiter.api.Test;

import static com.kaelzhang.kata.App.getSlogan;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testSlogan(){
        String slogan = getSlogan("hi");
        assertEquals("hi world!", slogan);
    }
}
