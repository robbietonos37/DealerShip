import java.sql.SQLOutput;
import java.util.ArrayList;

public class Dealership {
        //Here we will create the new dealership that will hold an array list of car lots.
        private String dealershipName;
        private ArrayList<CarLot> carlots = new ArrayList<CarLot>();

        //empty constructor
        public Dealership(){
        dealershipName = " ";
        }

        //nonempty constructor

        public Dealership(String dealerName){
        dealershipName = dealerName;
        }

        public void setDealershipName(String dealerName){
        dealershipName = dealerName;
        }

        public String getDealershipName(){
        return dealershipName;
        }

        //Here is where we will add new car lots into the array list
        public void addLotInDealership(String lotName, int numVehicles){
        carlots.add(new CarLot(lotName, numVehicles));
        }

        //Here is where we will add vehicles into the vehicles array that each car lot holds
        public void addVehicleToCarLot(String carMake, String model, String color, double price, int index){
        carlots.get(index).addVehicles(carMake, model, color, price);
        }


        //This was used to check if a car lot is indeed added
        public CarLot getCarLotCell(int i){
        return carlots.get(i);
        }

        //Here is where we will print all the info associated with a car lot

        public void printCarLots(){
        for(int i = 0; i < carlots.size(); i++){
                carlots.get(i).printInfo();
                carlots.get(i).averageCost();
                System.out.println();
        }

        }
        //Here is where we call the sort method we created in CarLot to assort all the lots in the array list.
        public void sortCarLots(){
                for(int i = 0; i < carlots.size(); i++) carlots.get(i).selectionSortCost();

        }

        //Here is where we go through each lot to see which cars are above 10k and print them
        public void tenKCars(){
                for(int j = 0; j < carlots.size(); j++) carlots.get(j).printVehiclesAbove();
        }
}
