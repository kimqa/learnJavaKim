package currency;

public class CanDollar extends Currency implements IsFreeConverted {

    public CanDollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "CAD";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
