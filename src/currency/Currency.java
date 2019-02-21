package currency;

import org.apache.log4j.Logger;

abstract public class Currency { // abstract значит что можно наследовать, но не создавать объекты

    private double kursNBU;
    private double marga = 0.1;
    protected Logger logger;

    public Currency(double kursNBU) { //java конструктор, для того чтоб при создании объекта можно было сразу передавать значения во время создавания объекта
        this.kursNBU = kursNBU; // this. - курс из класса , 2-й kursNBU - цифра из вне
        logger = Logger.getLogger(getClass());
    }

    public double getKursNBU() { //getter
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) { //setter
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double exchangeCurrencyToGrn(double amountOfCurrency) {
        double tempResult = amountOfCurrency * kursNBU * (1 - marga);
        logger.info("For " + amountOfCurrency + "(" +  kursNBU + ") " + getCurrencyName() + " you get " + tempResult + "UAH");
//        System.out.println("For " + amountOfCurrency + "(" +  kursNBU + ") " + getCurrencyName() + " you get " + tempResult + "UAH");
        return tempResult;
    }

    abstract String getCurrencyName(); //абстрактный метод


}
