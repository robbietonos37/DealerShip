import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {

    @Test
    void setlotName() {
        Dealership dealership = new Dealership();
        dealership.setDealershipName("Big Rob's");
        assertTrue(dealership.equals("Big Rob's"));
    }

    @Test
    void addLot() {
        Dealership dealership = new Dealership();
        dealership.addLotInDealership("Lot1", 7);
        assertNotNull(dealership.getCarLotCell(0));
    }

    @Test
    void addVehicleToCarLot() {
    }
}