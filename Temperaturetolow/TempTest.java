public class TempTest {

    public static void main(String[] args) throws TemperatureTooLow {
        Fridge f1 = new Fridge();

        f1.setTemp(35);
        System.out.println(f1.tempNormal());
        f1.setTemp(8);
        System.out.println(f1.tempNormal());

    }

}