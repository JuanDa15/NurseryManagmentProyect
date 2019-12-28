
package BuilderDesignPatternNotImplemented;
import Crud.ReadData;
import Models.FungusControl;
import Models.ProductControl;
//concrete Builder
public class FungusControlBuilder extends ProductControlBuilder{
    FungusControl unguent = (FungusControl)product;
    
    public void buildFungusName(){
        unguent.setFungusName(ReadData.readDataString());
    }
    
    public void buildCarencyPeriod(){
        unguent.setCarencyPeriod(ReadData.readDataString());
    }
    @Override
    public void buildName() {
        unguent.setProductName(ReadData.readDataString());
    }

    @Override
    public void buildIcaRegister() {
        unguent.setIcaRegister(ReadData.readDataString());
    }

    @Override
    public void buildAplicationFrecuency() {
        unguent.setAplicationFrecuency(ReadData.readDataString());
    }

    @Override
    public void buildProductCost() {
        unguent.setProductCost(ReadData.readDataNumber());
    }

    @Override
    public ProductControl create() {
        this.buildName();
        this.buildIcaRegister();
        this.buildAplicationFrecuency();
        this.buildFungusName();
        this.buildCarencyPeriod();
        return unguent;
    }
    
}
