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
        waterBottle.drink();
        assertEquals(90, waterBottle.volume());
    }

    @Test
    public void checkVolumeIsZeroWhenEmptied(){
        waterBottle.empty();
        assertEquals(0, waterBottle.volume());
    }

    @Test
    public void checkVolumeIs100WhenFilled(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.volume());
    }
}


