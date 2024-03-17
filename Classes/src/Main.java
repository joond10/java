
//Our class representing the java file
public class Main {

    //Our main method which  is the entry point into program execution
    public static void main(String[] args) {

    //Client code here
    }

}


//Class name
//By default it is package-private - accessible within this namespace
//Normally each class should be in its own separate java file
class Bicycle {

    //Data members are referred to as fields
    //We explicitly set them to private
    private int cadence;
    private int gear;
    private int speed;

    //Methods are public to access our private fields
    //This is a parameterized constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    //and this is a default/empty constructor
    public Bicycle() {
        gear = 1;
        cadence = 10;
        speed = 0;
    }

    //Getter and setters
    public int getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}

//We use the keyword extends to say this class is extended/derived of Bicycle
class MountainBike extends Bicycle {

    // the MountainBike subclass has one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear); //We explicitly construct the base class using the super keyword
        seatHeight = startHeight;
    }

    // the MountainBike subclass has one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
