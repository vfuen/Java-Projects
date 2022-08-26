public class Car extends Vehicle {

    private String name;
    private int number_of_cylinders;

    public Car(String n, int c, int ms) {
        super(n);
        super.getName();
        number_of_cylinders = c;
        super.setMaxSpeed(ms);

    }

    public void setNumOfCylinders(int noc) {
        number_of_cylinders = noc;
    }

    public int getNumOfCylinders() {
        return number_of_cylinders;
    }

    public String toString() {
        return " Car:" + super.getName() + " Cylinders:" +
                number_of_cylinders + " Speed:" + super.getMaxSpeed()
                + "mph";
    }

}
