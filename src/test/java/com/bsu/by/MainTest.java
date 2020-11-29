package com.bsu.by;

import static com.bsu.by.Main.isValidNumber;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @org.junit.jupiter.api.Test
    void testIsValidNumber1() {
        String number = "36,000.57";
        assertEquals(true,isValidNumber(number));
    }

    @org.junit.jupiter.api.Test
    void testIsValidNumber2() {
        String number = "9 999 352";
        assertEquals(true,isValidNumber(number));
    }

    @org.junit.jupiter.api.Test
    void testIsValidNumber3() {
        String number = "10.444444444444";
        assertEquals(true,isValidNumber(number));
    }

    @org.junit.jupiter.api.Test
    void testIsValidNumber4() {
        String number = "1,024";
        assertEquals(true,isValidNumber(number));
    }
}
