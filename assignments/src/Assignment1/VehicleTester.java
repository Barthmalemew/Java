package Assignment1;

import java.nio.FloatBuffer;

public class VehicleTester {
    public static void main(String[] args){
        Truck truck1 = new Truck("Ford", 6, "Jarvis", 2.5, 5.2);
        truck1.displayInfo();

        Truck truck2 = new Truck("Dodge", 8, "Dave", 3.1, 7.2);
        truck2.displayInfo();
    }
}

class Vehicle{
    String mfName;
    int numCyl;
    String owner;

    public Vehicle(){
        mfName = "";
        numCyl = 0;
        owner = "";
    }

    public Vehicle(String mfName, int numCyl, String owner) {
        this.mfName = mfName;
        this.numCyl = numCyl;
        this.owner = owner;
    }

    public void displayInfo(){
        System.out.println("Manufacturer: " + getMfName() + "\n" + "Number of cylinders: " + getNumCyl() + "\n" + "Owner: " + getOwner());
    }

    public String getMfName() {
        return mfName;
    }

    public int getNumCyl() {
        return numCyl;
    }

    public String getOwner() {
        return owner;
    }
}

class Truck extends Vehicle{
    double loadCap;
    double towCap;

    public Truck(){
        super();
        loadCap = 0.0;
        towCap = 0.0;
    }

    public Truck(String mfName, int numCyl, String owner, double loadCap, double towCap){
        super(mfName, numCyl, owner);
        this.loadCap = loadCap;
        this.towCap = towCap;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load capacity: " + getLoadCap() + "\n" + "Towing capacity: " + getTowCap() + "\n");
    }

    public double getLoadCap() {
        return loadCap;
    }

    public double getTowCap() {
        return towCap;
    }
}
