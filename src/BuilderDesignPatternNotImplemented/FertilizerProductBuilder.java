
package BuilderDesignPatternNotImplemented;
import Crud.ReadData;
import Models.FertilizerControl;
import Models.ProductControl;
//concreteBuilder
public class FertilizerProductBuilder extends ProductControlBuilder{
    FertilizerControl fertilizer = (FertilizerControl)product;
    
    public void buildLastAplication(){
        fertilizer.setLastAplication(ReadData.readDataString());
    }
    @Override
    public void buildName() {
        fertilizer.setProductName(ReadData.readDataString());
    }

    @Override
    public void buildIcaRegister() {
        fertilizer.setIcaRegister(ReadData.readDataString());
    }

    @Override
    public void buildAplicationFrecuency() {
        fertilizer.setAplicationFrecuency(ReadData.readDataString());
    }

    @Override
    public void buildProductCost() {
        fertilizer.setProductCost(ReadData.readDataNumber());
    }

    @Override
    public ProductControl create() {
        this.buildName();
        this.buildIcaRegister();
        this.buildLastAplication();
        this.buildAplicationFrecuency();
        this.buildProductCost();
        return fertilizer;
    }
    
}
