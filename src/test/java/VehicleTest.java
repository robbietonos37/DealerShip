import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    //Here we will test the empty constructor
    @Test
    void emptyConstructor(){
        Vehicle vehicle = new Vehicle();
        assertNotNull(vehicle);
    }
    //Here we will test the nonempty constructor for the make
    @Test
    void noEmptyConstructorCarMake(){
        Vehicle vehicle = new Vehicle("Ford"," ", " ", 0.0);
        assertTrue(vehicle.getCarMake().equals("Ford"));
    }
    //Here we will test the nonempty constructor for the model
    @Test
    void noEmptyConstructorModel(){
        Vehicle vehicle = new Vehicle(" ", "F-150", " ", 0.0);
        assertEquals("F-150", vehicle.getModel());
    }
    //Here we will test the nonempty constructor for color
    @Test
    void noEmptyConstructorColor(){
        Vehicle vehicle = new Vehicle(" ", " ", "Black", 0.0);
        assertEquals("Black", vehicle.getColor());
    }
    //Here we will test the nonempty constructor for price
    @Test
    void noEmptyConstructorPrice(){
        Vehicle vehicle = new Vehicle(" ", " ", " ", 29997.95);
        assertEquals(vehicle.getPrice(), 29997.95);
    }
    //Here we will test the method to set the make
    @Test
    void setCarMake(){
        Vehicle vehicle = new Vehicle();
        vehicle.setCarMake("Ford");
        assertTrue(vehicle.getCarMake().equals("Ford"));
    }
    //Here we will test the method to set the model
    @Test
    void setModel(){
        Vehicle vehicle = new Vehicle();
        vehicle.setModel("F-150");
        assertEquals("F-150", vehicle.getModel());
    }
    //Here we will test the method to set the color
    @Test
    void setColor(){
        Vehicle vehicle = new Vehicle();
        vehicle.setColor("Black");
        assertEquals("Black", vehicle.getColor());
    }
    //Here we will test the method to set the price
    @Test
    void setPrice(){
        Vehicle vehicle = new Vehicle();
        vehicle.setPrice(29997.95);
        assertEquals(29997.95, vehicle.getPrice());
    }
}