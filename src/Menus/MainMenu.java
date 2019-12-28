package Menus;

import Crud.ShowData;
import Models.Producer;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    public static void menu(ArrayList<Producer> producerList){
        int option = 0;
        Scanner Scan = new Scanner(System.in);
        while(option != 1){
            System.out.println("        ---Menu principal---        ");
            System.out.println("\n1).Salir.                         ");
            System.out.println("2).Crear productor.                 ");
            System.out.println("3).Buscar productor.                ");
            System.out.println("4).Mostrar informacion productores. ");
            
            option = Scan.nextInt();
            switch(option){
                case 2:
                    Menus.MenuCreate.createOption(producerList);
                    break;
                case 3:
                    Crud.SearchProducer.searchProducerByID(producerList);
                    break;
                case 4:
                    ShowData.showProducerData(producerList);
                    break;
            }
        }
    }
}
