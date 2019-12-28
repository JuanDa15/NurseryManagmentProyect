package Crud;
import Models.Nursery;
import Models.Producer;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchProducer {
    public static void searchProducerByID(ArrayList<Producer> producerList){
        Producer Tproducer = null;
        int position = 0;
        int ID = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Ingrese la identificacion del usuario: ");
        int id = Scan.nextInt();
        for(Producer producer: producerList){
            if(id == producer.getId()){
               Tproducer = producer;
               position = producerList.indexOf(producer);
            }
        }
        Menus.MenuSearchProducer.menuSearch(producerList,Tproducer,position);
    }
    public static void showNurseryInf(ArrayList<Nursery> nurseryList){
        if(nurseryList.isEmpty() != true){
            for(Nursery nursery: nurseryList){
            System.out.println("El nombre del vivero es: " + nursery.getName());
            System.out.println("El codigo del vivero es: " + nursery.getCode());
            System.out.println("La ubicacion del vivero es: " + nursery.getDepartment() + nursery.getMunicipality());
            System.out.println("------------------------------------------");
            }
        }else{
            System.out.println("El productor no tiene viveros. ");
        }
    }
}
