import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 20);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(20, printer.getToner());
    }

    @Test
    public void canPrint(){
        printer.print(2, 5);
        assertEquals(90, printer.getPaper());
        assertEquals(10, printer.getToner());
    }

}
