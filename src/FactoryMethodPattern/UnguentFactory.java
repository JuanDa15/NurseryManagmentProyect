package FactoryMethodPattern;
import Crud.ReadData;
import Models.FungusControl;
import Models.ProductControl;

public class UnguentFactory implements FactoryProduct{
    @Override
    public ProductControl createProduct() {
        FungusControl unguent = new FungusControl();
        System.out.println("            ---Creando unguento---          ");
        System.out.println("Ingrese el nombre del producto:             ");
        unguent.setProductName(ReadData.readDataString());
        System.out.println("Ingrese el registro ICA del producto:       ");
        unguent.setIcaRegister(ReadData.readDataString());
        System.out.println("Ingrese la frecuencia de aplicacion:        ");
        unguent.setAplicationFrecuency(ReadData.readDataString());
        System.out.println("Ingrese el periodo de carencia:             ");
        unguent.setCarencyPeriod(ReadData.readDataString());
        System.out.println("Ingrese el nombre del hongo que trata:      ");
        unguent.setFungusName(ReadData.readDataString());
        System.out.println("    ---Unguento creado correctamente---     ");
        return unguent;
    }

    @Override
    public void showData(ProductControl product) {
        FungusControl unguent = (FungusControl)product;
        System.out.println("-----------------------------------------------");
        System.out.println("El nombre del producto es: " + unguent.getProductName());
        System.out.println("El registro ICA del producto es: " + unguent.getIcaRegister());
        System.out.println("La frecuencia de aplicacion del producto es: " + unguent.getAplicationFrecuency());
        System.out.println("El periodo de carencia del producto es: " + unguent.getCarencyPeriod());
        System.out.println("El hongo que afecta la planta es: " + unguent.getFungusName());
    }
    
}
