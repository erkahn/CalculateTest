package com.sahabt.testOdev;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void cevreTest(){
        App app = new App();
        Assert.assertEquals("Cevre bulunamadi", 12,app.cevreBul());
    }

    @Test
    public void alanTest(){
        App app = new App();
        Assert.assertEquals("Alan Bulunamadi", 48, app.alanBul());
    }
}
