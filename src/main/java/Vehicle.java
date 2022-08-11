public class Vehicle {

    //Here we declare the variables that will describe each vehicle
    private String carMake;
    private String model;
    private String color;
    private double price;

    //This will be the empty constructor
    public Vehicle(){
        carMake = "";
        model = "";
        color = "";
        price = 0.0;
    }

    //This will be the non-empty constructor
    public Vehicle(String make, String model, String color, double price){
        carMake = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //Here we will use setters for the details of each vehicle sold

    public void setCarMake(String make) {
        carMake = make;
    }
    public void setModel(String m) {
        model = m;
    }
    public void setColor(String c){
        color = c;
    }
    public void setPrice(double p) {
        price = p;
    }

    //Here we will use getters in order to be able to retrieve each value

    public String getCarMake(){
        return carMake;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Vehicle Make: " + carMake + " Model: " + model +  " Color " + color + " Price " + price;
    }
}



