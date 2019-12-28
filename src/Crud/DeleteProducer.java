package Crud;
import Models.Producer;
import java.util.ArrayList;

public class DeleteProducer {
    public static void deleteByID(int position,ArrayList<Producer> producerList){
        Producer confirmation;
        confirmation = producerList.remove(position);
        if(confirmation != null){
            System.out.println("El productor fue eliminado correctamente.");
        }else{
            System.out.println("El productor no se pudo eliminar.");
        }
    }
}
