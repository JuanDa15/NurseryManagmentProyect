package Crud;
import Models.Labor;
import Models.Nursery;
import Models.Producer;
import java.util.ArrayList;
import java.util.Scanner;

public class Verifications {
    public static int userVerification(ArrayList<Producer> producerList){
        int position = 999;
        Scanner Scan = new Scanner(System.in);
        System.out.println("ingrese la identificacion del productor: ");
        int id = Scan.nextInt();
        for(Producer producer: producerList){
            if(producer.getId() == id){
                position = producerList.indexOf(producer);
            }
        }
        return position;
    } 
    
    public static int nurseryVerification(ArrayList<Nursery> nurseryList){
        int position = 999;
        Scanner Scan = new Scanner(System.in);
        System.out.println("ingrese el codigo del vivero: ");
        String code = Scan.nextLine();
        for(Nursery nursery: nurseryList){
            if(code.equals(nursery.getCode())){
                position = nurseryList.indexOf(nursery);
            }else{
                System.out.println("El vivero no esta registrado. ");
            }
        }
        return position;
    }
    
    public static int laborVerification(ArrayList<Labor> laborList){
        int position = 999;
        Scanner Scan = new Scanner(System.in);
        System.out.println("ingrese el nombre de la labor: ");
        String name = Scan.nextLine();
        for(Labor labor: laborList){
            if(name.equals(labor.getName())){
                position = laborList.indexOf(labor);
            }else{
                System.out.println("La labor no esta registrada.");
            }
        }
        return position;
    }
}
