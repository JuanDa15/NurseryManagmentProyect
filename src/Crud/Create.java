package Crud;
import Models.Labor;
import Models.Nursery;
import Models.Producer;
import java.util.ArrayList;

public class Create {
    public static void addProducer(ArrayList<Producer> producerList){
        producerList.add((Producer)(new FactoryMethodPattern.ProducerFactory().createObject()));
    }
    public static void addNursery(ArrayList<Producer> producerList){
        int userPosition = Verifications.userVerification(producerList);
        if(userPosition != 999){
            producerList.get(userPosition).getNurseryList().add((Nursery)(new FactoryMethodPattern.NurseryFactory().createObject()));
        }
    }
    public static void addLabor(ArrayList<Producer> producerList){
        int userPosition = Verifications.userVerification(producerList);
        int nurseryPosition = Verifications.nurseryVerification(producerList.get(userPosition).getNurseryList());
        if(userPosition != 999){
            if(nurseryPosition != 999){
                producerList.get(userPosition).getNurseryList().get(nurseryPosition).getLaborList().add((Labor)(new FactoryMethodPattern.LaborFactory().createObject()));
            }
        }
    }
    public static void addControl(ArrayList<Producer> producerList){
        int userPosition = Verifications.userVerification(producerList);
        int nurseryPosition = Verifications.nurseryVerification(producerList.get(userPosition).getNurseryList());
        int laborPosition = Verifications.laborVerification(producerList.get(userPosition).getNurseryList().get(nurseryPosition).getLaborList());
        if(userPosition != 999){
            if(nurseryPosition != 999){
                if(laborPosition != 999){
                    Menus.MenuLabors.MenuSelectLabor(producerList,userPosition,nurseryPosition,laborPosition);
                }
            }
        }
    }
}
