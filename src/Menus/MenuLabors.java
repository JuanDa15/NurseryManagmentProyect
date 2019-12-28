package Menus;
import Models.Producer;
import Models.ProductControl;
import Models.WeedPhysicalControl;
import java.util.ArrayList;
import java.util.Scanner;
import Crud.SelectProduct;


public class MenuLabors {
    public static void MenuSelectLabor(ArrayList<Producer> producerList,int userPosition, int nurseryPosition,int laborPosition){
        int option = 0;
        Scanner Scan = new Scanner(System.in);
        while(option != 1){
            System.out.println("        ---Seleccion Labores---      ");
            System.out.println("\n1).Salir.                          ");
            System.out.println("2).Crear producto de control.        ");
            System.out.println("3).Crear control de maleza.          ");
            
            option = Scan.nextInt();
            switch(option){
                case 2:
                    menuProductControl(producerList.get(userPosition).getNurseryList().get(nurseryPosition).getLaborList().get(laborPosition).getProductList());
                    break;
                case 3:
                    MenuControlMaleza(producerList.get(userPosition).getNurseryList().get(nurseryPosition).getLaborList().get(laborPosition).getList());
                    break;
            }
        }
    }
    
    public static void menuProductControl(ArrayList<ProductControl> productList){
        int option = 0;
        Scanner scan = new Scanner(System.in);
        int remainingProducts = 0, quantityProducts = 0,productType = 0;
        System.out.println("cuantos productos desea agregar: ");
        quantityProducts = scan.nextInt();
        while(remainingProducts < quantityProducts){
            System.out.println("Agregar productos de control(1. fertilizante, 2.pesticida, 3.unguento): ");
            productType = scan.nextInt(); 
            ProductControl product;
            product = SelectProduct.select(productType);
            productList.add(product);
            remainingProducts += 1;
        }
    }
    
    public static void MenuControlMaleza(ArrayList<WeedPhysicalControl> list){
        list.add((WeedPhysicalControl)(new FactoryMethodPattern.PhysicalControlFactory().createObject()));
    }
}
