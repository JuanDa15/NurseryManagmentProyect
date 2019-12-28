
package BuilderDesignPatternNotImplemented;
//director class

import Models.ProductControl;


public class Factory {
    private ProductControlBuilder productControl;
    
    public void setProductControl(ProductControlBuilder product){
        productControl = product;
    }
    
    public ProductControl getProduct(){
        return productControl.getProductControl();
    }
}
