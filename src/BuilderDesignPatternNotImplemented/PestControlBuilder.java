
package BuilderDesignPatternNotImplemented;
//concrete builder

import Crud.ReadData;
import Models.PestControl;
import Models.ProductControl;


public class PestControlBuilder extends ProductControlBuilder{
    PestControl pesticide = (PestControl)product;
    
    public void buildCarencyPeriod(){
        pesticide.setCarencyPeriod(ReadData.readDataString());
    }
    @Override
    public void buildName() {
        pesticide.setProductName(ReadData.readDataString());
    }

    @Override
    public void buildIcaRegister() {
        pesticide.setIcaRegister(ReadData.readDataString());
    }

    @Override
    public void buildAplicationFrecuency() {
        pesticide.setAplicationFrecuency(ReadData.readDataString());
    }

    @Override
    public void buildProductCost() {
        pesticide.setProductCost(ReadData.readDataNumber());
    }

    @Override
    public ProductControl create() {
        this.buildName();
        this.buildIcaRegister();
        this.buildAplicationFrecuency();
        this.buildProductCost();
        this.buildCarencyPeriod();
        return pesticide;
    }
    
    
}
