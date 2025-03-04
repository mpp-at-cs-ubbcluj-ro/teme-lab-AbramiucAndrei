import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("Primul test")
    public void testFirst(){
        ComputerRepairRequest crr = new ComputerRepairRequest();
        assertEquals("",crr.getOwnerAddress());
        assertEquals("",crr.getOwnerName());
    }

    @Test
    @DisplayName("Al doilea test")
    public void testSecond(){
        assertEquals(0,new ComputerRepairRequest().getID());
    }
}
