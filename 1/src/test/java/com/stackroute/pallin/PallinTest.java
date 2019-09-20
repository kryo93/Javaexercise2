package com.stackroute.pallin;

import org.junit.Test;

import static org.junit.Assert.*;

public class PallinTest {

    @Test
    public void main()
    {
        Pallin obj = new Pallin();
        String res = obj.rev("reverse");
        assertEquals("The given 2 strings do not qualify as pallindrome", res);
    }
}