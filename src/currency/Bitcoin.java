package currency;

public class Bitcoin extends Currency {
    public Bitcoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Bitcoin";
    }

    @Override
    public double exchangeCurrencyToGrn( double amount) {
        logger.info("Can not exchange " + getCurrencyName() + " take your " + amount + " " + getCurrencyName() + "/s");
//        System.out.println("Can not exchange " + getCurrencyName() + " take your " + amount + " " + getCurrencyName() + "/s");
        return amount;
    }
}
