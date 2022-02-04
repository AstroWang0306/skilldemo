import static org.junit.Assert.*;
import org.junit.*;

public class skilldemotest{
    @Test
    public void production() {
        assertEquals(2, skilldemo.product(2,3));
    }
}