import java.sql.SQLOutput;

public class CarLot {

    private int counter = 0;
    private String lotName;
    //Here we will create the array to store the vehicles we add
    private Vehicle[] vehicles = new Vehicle[10];
    //This number will keep up with the number of vehicles that are created in the array
    private int arrayIndex = 0;

    //empty constructor
    public CarLot(){
        lotName = " ";
        vehicles = new Vehicle[10];
        counter = 0;
    }

    //non-empty constructor
    public CarLot(String l, int i){
        lotName = l;
        vehicles = new Vehicle[i];
        counter = 0;
    }

    public void setLotName(String l){
        lotName = l;
    }

    public String getLotName(){
        return lotName;
    }

    //The method used in order to add vehicles into the array and to keep count
    public void addVehicles(String make, String model, String color, double price){
        vehicles[arrayIndex] = new Vehicle(make, model, color, price);
        arrayIndex++;
    }
    //The method that will print a hello message and give information about the cars that have been sold
    public void printInfo(){
        System.out.println("Welcome to " + lotName + " car lot!");
        System.out.println("The number of cars sold at the lot is " + arrayIndex);
        System.out.println(lotName + " has sold the following vehicles");
        for(int i = 0; i < arrayIndex; i++) {
            System.out.println("Car Make: " + vehicles[i].getCarMake() + "" +
                    " Model: " + vehicles[i].getModel() + " Color: " + vehicles[i].getColor()
                    + " Price $" + vehicles[i].getPrice());
        }

    }

    public void printVehiclesAbove(){
        int count = 0;
        System.out.println("Here are the vehicles in " + lotName + " that cost over 10,000 dollars.");
        for(int i = 0; i < arrayIndex; i++){
            if(vehicles[i].getPrice() >= 10000){
                System.out.println(vehicles[i].toString());
                System.out.println();
                count++;
            }
            else System.out.println();

        }
        if(count == 0){
            System.out.println("This lot has no vehicles that are priced above 10,000.");
        }

    }
    //Here the method will verify that a vehicle was created and stored in the array
    public Vehicle getVehicleCell(int i){
        return vehicles[i];
    }
    //Here the method will calculate the average price of vehicles sold and print it
    //along with a goodbye message
    public void averageCost(){

        double sum = 0.0;
        for (int i = 0; i < arrayIndex; i++) {
            sum += vehicles[i].getPrice();
        }
        System.out.printf("The average cost of cars we sold is $%,.2f\n", (sum / arrayIndex));
    }

    public void selectionSortCost(){
        int indexOfLargestPrice;
        Vehicle largestVehiclePrice;

            for(int outerControl = 0; outerControl < vehicles.length - 1; outerControl++){
                indexOfLargestPrice = outerControl;
                largestVehiclePrice = vehicles[outerControl];

                for(int innerControl = outerControl + 1; innerControl < vehicles.length; innerControl++){

                    if(vehicles[innerControl].getPrice() > largestVehiclePrice.getPrice()){
                        largestVehiclePrice = vehicles[innerControl];
                        indexOfLargestPrice = innerControl;
                    }
                }
                vehicles[indexOfLargestPrice] = vehicles[outerControl];

                vehicles[outerControl] = largestVehiclePrice;
            }
        }
    }




