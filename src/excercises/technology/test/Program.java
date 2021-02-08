package excercises.technology.test;

import excercises.technology.Smartphone;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

import static org.junit.Assert.assertEquals;

public class Program {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void inheritsSuperInFirstConstructor() {
        Smartphone iPhone = new Smartphone("Apple", 60, "English", 5, "Wide Angle");
        assertEquals(60, iPhone.getMemory(), .001);
    }

}
