package com.stackroute.evenOdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class evenNoTest {

    @Test
    public void evenFind()
    {
        evenNo obj = new evenNo();
        boolean result = obj.isEven(4);
        assertEquals(true,result);
    }
}