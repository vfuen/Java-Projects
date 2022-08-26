public class Fridge {
    private int temperature;

    public void setTemp(int t) {
        temperature = t;

    }

    public boolean tempNormal() throws TemperatureTooLow {
        if (temperature < 10) {
            throw new TemperatureTooLow(temperature);

        }
        return true;

    }
}