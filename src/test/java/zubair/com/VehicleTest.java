package zubair.com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    Vehicle TestObj = new Vehicle();
    Engine engine = new Engine();
    @Before
    public void setUp() throws Exception {
        TestObj.setBrand("Ford");
        TestObj.setName("Figo");


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getBrand() {
        assertEquals("Test Has been Run", TestObj.getBrand(),"Ford");
    }

    @Test
    public void setBrand() {


    }

    @Test
    public void getName() {
        assertEquals("Test Has been Run", TestObj.getName(), "Figo");
    }

    @Test
    public void setName() {
    }

    @Test
    public void engineSound() {
        assertTrue("Ratatatatata!", true);
    }
}