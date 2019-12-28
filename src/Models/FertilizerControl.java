package Models;

public class FertilizerControl extends ProductControl{
    private String lastAplication;

    public FertilizerControl() {
    }

    public FertilizerControl(String lastAplication) {
        this.lastAplication = lastAplication;
    }

    public FertilizerControl(String lastAplication, String icaRegister, String productName, String aplicationFrecuency, int productCost) {
        super(icaRegister, productName, aplicationFrecuency, productCost);
        this.lastAplication = lastAplication;
    }

    public String getLastAplication() {
        return lastAplication;
    }

    public void setLastAplication(String lastAplication) {
        this.lastAplication = lastAplication;
    }
}
