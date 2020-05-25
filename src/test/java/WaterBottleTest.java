import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasWater(){
        assertEquals(100, waterBottle.water());
    }

    @Test
    public void canDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.water());
    }

    @Test
    public void canFill(){
        waterBottle.fill();
        assertEquals(100, waterBottle.water());
    }

}
