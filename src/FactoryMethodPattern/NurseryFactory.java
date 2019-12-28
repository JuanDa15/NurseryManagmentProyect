package FactoryMethodPattern;

import Crud.ReadData;
import Models.Labor;
import Models.Nursery;
import java.util.ArrayList;

public class NurseryFactory implements FactoryObject{

    @Override
    public Object createObject() {
        Nursery nursery = new Nursery();
        ArrayList<Labor> laborList = new ArrayList<>();
        System.out.println("            ---Creando Vivero---            ");
        System.out.println("Ingrese el codigo del vivero:               ");
        nursery.setCode(ReadData.readDataString());
        System.out.println("Ingrese el nombre del vivero:               ");
        nursery.setName(ReadData.readDataString());
        System.out.println("Ingrese departamento donde se ubica:        ");
        nursery.setDepartment(ReadData.readDataString());
        System.out.println("Ingrese municipio donde se ubica:           ");
        nursery.setMunicipality(ReadData.readDataString());
        nursery.setLaborList(laborList);
        System.out.println("    ---Vivero registrado correctamente---   ");
        return nursery;
    }
    
}
