package FactoryMethodPattern;

import Crud.ReadData;
import Models.FertilizerControl;
import Models.ProductControl;

public class FertilizerFactory implements FactoryProduct{
    @Override
    public ProductControl createProduct() {
        FertilizerControl fertilizer = new FertilizerControl();
        System.out.println("         ---Creando Fertilizante---         ");
        System.out.println("Ingrese el nombre del fertilizante:         ");
        fertilizer.setProductName(ReadData.readDataString());
        System.out.println("Ingrese el Registro ICA del producto:       ");
        fertilizer.setIcaRegister(ReadData.readDataString());
        System.out.println("Ingrese la frecuencia de aplicacion:        ");
        fertilizer.setAplicationFrecuency(ReadData.readDataString());
        System.out.println("Ingrese el costo del producto:              ");
        fertilizer.setProductCost(ReadData.readDataNumber());
        System.out.println("Ingrese ultima aplicacion del producto:     ");
        fertilizer.setLastAplication(ReadData.readDataString());
        System.out.println("  ---Fertilizante creado correctamente---   ");
        return fertilizer;
    }  

    @Override
    public void showData(ProductControl product) {
        FertilizerControl product1 = (FertilizerControl) product;
        System.out.println("--------------------------------------------");
        System.out.println("El nombre del producto es: " + product1.getProductName());
        System.out.println("El registro ICA del producto es " + product1.getIcaRegister());
        System.out.println("El costo del producto es: " + product1.getProductCost());
        System.out.println("La frecuencia de aplicacion del producto es: " + product.getAplicationFrecuency());
        System.out.println("La ultima aplicacion del producto fue: " + product1.getLastAplication());
    }
}
