public class TemperatureTooLow extends Exception {

    TemperatureTooLow(int l) {
        super("The temperature " + l + " is to low");
    }

}