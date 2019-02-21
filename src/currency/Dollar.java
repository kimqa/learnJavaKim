package currency;

public class Dollar extends Currency implements IsFreeConverted {

    public Dollar(double kursNBU) { //SUPER class
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Dollar";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
