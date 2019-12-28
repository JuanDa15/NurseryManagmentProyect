package FactoryMethodPattern;
import Crud.ReadData;
import Models.PestControl;
import Models.ProductControl;

public class PesticideFactory implements FactoryProduct {

    @Override
    public ProductControl createProduct() {
        PestControl pesticide = new PestControl();
        System.out.println("            ---Creando Pesticida---         ");
        System.out.println("Ingrese el nombre del producto:             ");
        pesticide.setProductName(ReadData.readDataString());
        System.out.println("Ingrese el registro ICA del producto:       ");
        pesticide.setIcaRegister(ReadData.readDataString());
        System.out.println("Ingrese la frecuencia de aplicacion:        ");
        pesticide.setAplicationFrecuency(ReadData.readDataString());
        System.out.println("Ingrese el costo del producto:              ");
        pesticide.setProductCost(ReadData.readDataNumber());
        System.out.println("Ingrese el periodo de carencia:             ");
        pesticide.setCarencyPeriod(ReadData.readDataString());
        System.out.println("    ---Pesticida creado correctamente---    ");
        return pesticide;
    }

    @Override
    public void showData(ProductControl product) {
        PestControl pesticide = (PestControl) product;
        System.out.println("----------------------------------------------");
        System.out.println("El nombre del producto es: " + pesticide.getProductName());
        System.out.println("El registro ICA  del producto es: " + pesticide.getIcaRegister());
        System.out.println("El costo del producto es: " + pesticide.getProductCost());
        System.out.println("La frecuencia de aplicacion del producto es: " + pesticide.getAplicationFrecuency());
        System.out.println("El periodo de carencia del producto es: " + pesticide.getCarencyPeriod());
    }
    
}
