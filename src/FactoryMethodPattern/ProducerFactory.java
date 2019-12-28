package FactoryMethodPattern;

import Crud.ReadData;
import Models.Nursery;
import Models.Producer;
import java.util.ArrayList;

public class ProducerFactory implements FactoryObject{

    @Override
    public Object createObject() {
        Producer producer = new Producer();
        ArrayList<Nursery> nurseryList = new ArrayList<>();
        System.out.println("            ---Creando Productor---         ");
        System.out.println("Ingrese la identificacion del productor:    ");
        producer.setId(ReadData.readDataNumber());
        System.out.println("Ingrese el nombre del productor:            ");
        producer.setName(ReadData.readDataString());
        System.out.println("Ingrese el apellido del productor:          ");
        producer.setLastName(ReadData.readDataString());
        producer.setNurseryList(nurseryList);
        System.out.println("    ---Productor creado correctamente---    ");
        return producer;
    }
    
}
