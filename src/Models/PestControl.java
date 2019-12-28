package Models;

public class PestControl extends ProductControl{
    private String carencyPeriod;

    public PestControl() {
    }

    public PestControl(String carencyPeriod) {
        this.carencyPeriod = carencyPeriod;
    }

    public PestControl(String carencyPeriod, String icaRegister, String productName, String aplicationFrecuency, int productCost) {
        super(icaRegister, productName, aplicationFrecuency, productCost);
        this.carencyPeriod = carencyPeriod;
    }

    public String getCarencyPeriod() {
        return carencyPeriod;
    }

    public void setCarencyPeriod(String carencyPeriod) {
        this.carencyPeriod = carencyPeriod;
    }
}
