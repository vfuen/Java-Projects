public class Airplane extends Vehicle {

    private String name;
    private int number_of_engines;

    public Airplane(String n, int noe, int ms) {
        super(n);
        super.getName();
        number_of_engines = noe;
        super.setMaxSpeed(ms);

    }

    public void setNumOfEngines(int noe) {
        number_of_engines = noe;
    }

    public int getNumOfEngines() {
        return number_of_engines;
    }

    public String toString() {
        return "Plane:" + super.getName() + " Engines:" +
                number_of_engines + " Speed:" + super.getMaxSpeed()
                + "mph";
    }

}
