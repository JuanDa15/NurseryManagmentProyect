package Models;
import java.util.ArrayList;

public class Labor{
    private String name;
    private String type;
    private String realizationDate;
    private String Description;
    private ArrayList<ProductControl> productList;
    private ArrayList<WeedPhysicalControl> controlList;

    public Labor() {
    }

    public Labor(String name, String type, String realizationDate, String Description, ArrayList<ProductControl> productList, ArrayList<WeedPhysicalControl> controlList) {
        this.name = name;
        this.type = type;
        this.realizationDate = realizationDate;
        this.Description = Description;
        this.productList = productList;
        this.controlList = controlList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRealizationDate() {
        return realizationDate;
    }

    public void setRealizationDate(String realizationDate) {
        this.realizationDate = realizationDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ArrayList<ProductControl> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<ProductControl> productList) {
        this.productList = productList;
    }

    public ArrayList<WeedPhysicalControl> getList() {
        return controlList;
    }

    public void setList(ArrayList<WeedPhysicalControl> controlList) {
        this.controlList = controlList;
    }
}