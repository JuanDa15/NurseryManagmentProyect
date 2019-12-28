package FactoryMethodPattern;

import Crud.ReadData;
import Models.WeedPhysicalControl;

public class PhysicalControlFactory implements FactoryObject{

    @Override
    public Object createObject() {
        WeedPhysicalControl physicalControl = new WeedPhysicalControl();
        System.out.println("  ---Creando labor de control de maleza---  ");
        System.out.println("Ingrese la frecuencia de poda:              ");
        physicalControl.setPruningFrecuency(ReadData.readDataString());
        System.out.println("Ingrese la ultima vez que se podo:          ");
        physicalControl.setLastAplication(ReadData.readDataString());
        System.out.println("---Control maleza registrado correctamente---");
        return physicalControl;
    }
    
}
