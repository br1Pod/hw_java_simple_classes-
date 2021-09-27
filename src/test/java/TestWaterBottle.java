import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void checkVolume(){
        assertEquals(100, waterBottle.volume());
    }

    @Test
    public void checkDrinkReducesVolume(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void checkVolumeIsZeroWhenEmptied(){
        assertEquals(0, waterBottle.empty());
    }
}


