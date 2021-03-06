import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;                // to private !

    @Before
    public void before(){
        printer = new Printer(30, 45);
    }

    @Test
    public void checkPaperLevel(){
        assertEquals(30, printer.paperLevel());
    }

    @Test
    public void checkTonerLevel(){
        assertEquals(45, printer.tonerLevel());
    }

    @Test
    public void canPrint(){
        assertEquals(true, printer.print(2, 4));
    }

    @Test
    public void insufficientLevels() {
        assertEquals(false, printer.print(10, 25));
    }

    @Test
    public void reducePaperLevel(){
        printer.print(1, 1);
        assertEquals(29, printer.paperLevel());
    }

    @Test
    public void reduceTonerLevel(){
        printer.print(1, 1);
        assertEquals(44, printer.tonerLevel());
    }

}
