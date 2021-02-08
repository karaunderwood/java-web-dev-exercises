package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;
import org.launchcode.java.demos.lsn6inheritance.Cat;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class TestCat {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
