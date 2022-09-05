import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPages() {
        assertEquals(100, printer.getPages());
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.getToner());
    }
    @Test
    public void notEnoughPages() {
        assertEquals(-1, printer.printPages(50, 3));
    }

    @Test
    public void enoughPages() {
        assertEquals(0, printer.printPages(50, 2));
    }

    @Test
    public void notEnoughToner() {
        Printer printer1 = new Printer(100, 50);
        assertEquals(-1, printer1.printPages(50, 3));
    }

    @Test
    public void enoughToner() {
        Printer printer1 = new Printer(100, 50);
        printer1.printPages(25,2);
        assertEquals(0,printer1.getToner());
    }
}
