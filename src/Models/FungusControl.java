package Models;

public class FungusControl extends ProductControl{
    private String fungusName;
    private String carencyPeriod;

    public FungusControl() {
    }

    public FungusControl(String fungusName, String carencyPeriod, String icaRegister, String productName, String aplicationFrecuency, int productCost) {
        super(icaRegister, productName, aplicationFrecuency, productCost);
        this.fungusName = fungusName;
        this.carencyPeriod = carencyPeriod;
    }

    public String getFungusName() {
        return fungusName;
    }

    public void setFungusName(String fungusName) {
        this.fungusName = fungusName;
    }

    public String getCarencyPeriod() {
        return carencyPeriod;
    }

    public void setCarencyPeriod(String carencyPeriod) {
        this.carencyPeriod = carencyPeriod;
    }
}
