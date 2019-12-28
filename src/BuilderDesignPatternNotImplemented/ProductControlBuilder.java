
package BuilderDesignPatternNotImplemented;
//abstract builder

import Models.ProductControl;

public abstract class ProductControlBuilder {
    protected ProductControl product;
    
    public ProductControl getProductControl(){
        return product;
    }
    public void createNewProduct(){
        product = new ProductControl();
    }
    public abstract void buildName();
    public abstract void buildIcaRegister();
    public abstract void buildAplicationFrecuency();
    public abstract void buildProductCost();
    public abstract ProductControl create();
}
