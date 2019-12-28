package Menus;

import Models.Producer;
import java.util.ArrayList;
import java.util.Scanner;
public class MenuSearchProducer {
    public static void menuSearch(ArrayList<Producer> producerList,Producer producer,int producerPosition){
        int option = 0;
        Scanner Scan = new Scanner(System.in);
        while(option != 1){
            System.out.println("            ---Buscar Usuario---            ");
            System.out.println("1).Ir atras.                                ");
            System.out.println("2).Eliminar Usuario.                        ");
            System.out.println("3).Mostrar informacion de los viveros.      ");
            System.out.println("4).Mostrar toda la informacion.             ");
            
            option = Scan.nextInt();
            switch(option){
                case 2:
                    Crud.DeleteProducer.deleteByID(producerPosition, producerList);
                    break;
                case 3:
                    Crud.SearchProducer.showNurseryInf(producer.getNurseryList());
                    break;
                case 4:
                    Crud.ShowData.showNurseryData(producer.getNurseryList());
                    break;
            }
        }
    }
}
