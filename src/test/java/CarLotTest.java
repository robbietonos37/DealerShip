import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarLotTest {
    //Tests the empty constructor method made in CarLot
    @Test
    void emptyConstructor(){
        CarLot carLot = new CarLot();
        assertNotNull(carLot);
    }
    //Tests the nonempty constructor method made in CarLot
    @Test
    void nonEmptyConstructor(){
        CarLot carLot = new CarLot("Lot1", 7);
        assertEquals("Rob's", carLot.getLotName());
    }
    //Tests the addVehicles method to make sure vehicles will be added in
    @Test
    void addVehicles(){
        CarLot carLot = new CarLot();
        carLot.addVehicles(" ", " ", " ", 0.0);
        assertNotNull(carLot.getVehicleCell(0));
    }

    @Test
    void insertionSortCost(){

    }
}