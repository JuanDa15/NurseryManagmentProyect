package Models;

public class ProductControl {
    private String icaRegister;
    private String productName;
    private String aplicationFrecuency;
    private int productCost;

    public ProductControl() {
    }

    public ProductControl(String icaRegister, String productName, String aplicationFrecuency, int productCost) {
        this.icaRegister = icaRegister;
        this.productName = productName;
        this.aplicationFrecuency = aplicationFrecuency;
        this.productCost = productCost;
    }

    public String getIcaRegister() {
        return icaRegister;
    }

    public void setIcaRegister(String icaRegister) {
        this.icaRegister = icaRegister;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAplicationFrecuency() {
        return aplicationFrecuency;
    }

    public void setAplicationFrecuency(String aplicationFrecuency) {
        this.aplicationFrecuency = aplicationFrecuency;
    }

    public int getProductCost() {
        return productCost;
    }

    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }   
}
