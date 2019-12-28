package FactoryMethodPattern;

import Crud.ReadData;
import Models.Labor;
import Models.ProductControl;
import Models.WeedPhysicalControl;
import java.util.ArrayList;

public class LaborFactory implements FactoryObject{

    @Override
    public Object createObject() {
        Labor labor  = new Labor();
        ArrayList<ProductControl> productList = new ArrayList<>(); 
        ArrayList<WeedPhysicalControl> controlList = new ArrayList<>();
        System.out.println("             ---Creando Labor---            ");
        System.out.println("Ingrese el nombre de la labor:              ");
        labor.setName(ReadData.readDataString());
        System.out.println("Ingrese tipo de labor(Mecanico,Fisico...):  ");
        labor.setType(ReadData.readDataString());
        System.out.println("Ingrese la fecha de realizacion:            ");
        labor.setRealizationDate(ReadData.readDataString());
        System.out.println("Ingrese una descripcion de la labor:        ");
        labor.setDescription(ReadData.readDataString());
        labor.setProductList(productList);
        labor.setList(controlList);
        System.out.println("    ---Labor registrada correctamente---    ");
        return labor;
    }
    
}
