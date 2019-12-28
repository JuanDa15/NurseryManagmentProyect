package Menus;
import Crud.Create;
import Models.Producer;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuCreate {
    public static void createOption(ArrayList<Producer> producerList){
        int option = 0;
        Scanner Scan = new Scanner(System.in);
        while(option != 1){
            System.out.println("            ---Crear---         ");
            System.out.println("\n1).Salir.                     ");
            System.out.println("2).Crear Usuario.               ");
            System.out.println("3).Crear vivero.                ");
            System.out.println("4).Crear labor.                 ");
            System.out.println("5).Crear control.               ");
            
            option = Scan.nextInt();
            switch(option){
                case 2:
                    Create.addProducer(producerList);
                    break;
                case 3:
                    Create.addNursery(producerList);
                    break;
                case 4:
                    Create.addLabor(producerList);
                    break;
                case 5:
                    Crud.Create.addControl(producerList);
                    break;
            }
        }
    }
}
