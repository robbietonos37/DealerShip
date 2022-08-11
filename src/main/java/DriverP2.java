public class DriverP2 {

    /*
Name: Robert Tonos
Current Date: 6/12/22
Sources Consulted:
Robert Tonos

By submitting this work, I attest that it is my original work and that I did not violate
the University of Mississippi academic policies set forth in the M book.

Program Description:
This program will create a car dealership.
We will also add car lots to the dealership array list.
We will use a selection sort to sort the cars in each car lot
into descending order.
We will also see what cars are above 10,000 dollars in each lot and print those

*/


    public static void main(String[] args) {
        //Here we will create instantiate a new Dealership object
        Dealership dealership = new Dealership();

        System.out.println("Welcome to Big Rob's dealership!");

        //Here we will name our first lot

        dealership.addLotInDealership("Lot1", 7);

        //Here we will add vehicles to our first lot

        dealership.addVehicleToCarLot("Toyota", "Tundra", "Grey", 49997.99, 0);

        dealership.addVehicleToCarLot("Volkswagen", "Jetta", "Silver", 43937.99, 0);

        dealership.addVehicleToCarLot("Toyota", "Camry", "Black", 19887.89, 0);

        dealership.addVehicleToCarLot("Ford", "Expedition", "Silver", 33993.38, 0);

        dealership.addVehicleToCarLot("Ford", "Ranger", "Blue", 45975.91, 0);

        dealership.addVehicleToCarLot("Toyota", "Tacoma", "Brown", 37977.79, 0);

        dealership.addVehicleToCarLot("Honda", "Civic", "Red", 37937.79, 0);


        //Here we will add our second car lot into the dealership


        dealership.addLotInDealership("Lot2", 6);

        //Here we will be adding vehicles into the second lot

        dealership.addVehicleToCarLot("Tesla", "Model S", "Black", 81939.69, 1);

        dealership.addVehicleToCarLot("Volvo", "V90", "Silver", 42937.49, 1);

        dealership.addVehicleToCarLot("Jeep", "Grand Cherokee", "Grey", 53937.79, 1);

        dealership.addVehicleToCarLot("Dodge", "Challenger", "Red", 51911.19, 1);

        dealership.addVehicleToCarLot("Ford", "Mustang", "Blue", 46988.68, 1);

        dealership.addVehicleToCarLot("Chevrolet", "Camaro", "Yellow", 26776.67, 1);

        //Here we will add our third car lot into the dealership

        dealership.addLotInDealership("Lot3", 5);

        //Here we will add vehicles into the third car lot

        dealership.addVehicleToCarLot("Jeep", "Wrangler", "Red", 57873.33, 2);

        dealership.addVehicleToCarLot("Nissan", "Altima", "White", 23877.88, 2);

        dealership.addVehicleToCarLot("Ford", "Fusion", "Grey", 9817.19, 2);

        dealership.addVehicleToCarLot("Honda", "Pilot", "Brown", 5577.77, 2);

        dealership.addVehicleToCarLot("Chevrolet", "Malibu", "Black", 3877.11, 2);

        //Here we will add a fourth lot into the dealership

        dealership.addLotInDealership("Lot4", 4);

        //Here we will add vehicles into the 4th lot

        dealership.addVehicleToCarLot("Ford", "Crown Victoria", "Black", 7997.97, 3);

        dealership.addVehicleToCarLot("Toyota", "Corolla", "Biege", 9937.79, 3);

        dealership.addVehicleToCarLot("Pontiac", "Aztek", "Yellow", 6997.87, 3);

        dealership.addVehicleToCarLot("Ford", "Pinto", "Orange", 8937.33, 3);

        dealership.addVehicleToCarLot("Toyota", "Landcruiser", "Black", 29799.78, 3);

        System.out.println();
        //Here we will print all the information about each lot

        dealership.printCarLots();

        //Here we will pass all the car lots into our sort method

        dealership.sortCarLots();

        System.out.println();

        System.out.println("The car lots are now sorted with vehicles in descending price.");

        System.out.println();

        //We will now print all the information about the cars in descending order

        dealership.printCarLots();

        //Here we will go through each lot and determine what cars cost over 10k and print them

        dealership.tenKCars();

        System.out.println("Thanks for visiting my dealership! Have a great day!");
    }

}
