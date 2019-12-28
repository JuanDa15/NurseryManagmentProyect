package Crud;
import Models.FertilizerControl;
import Models.FungusControl;
import Models.Labor;
import Models.Nursery;
import Models.PestControl;
import Models.Producer;
import Models.ProductControl;
import Models.WeedPhysicalControl;
import java.util.ArrayList;

public class ShowData {
    public static void showProducerData(ArrayList<Producer> producerList){
        if(producerList.isEmpty() == true){
            System.out.println("No se encuentran productores registrados");
        }else{
            for(Producer producer: producerList){
                System.out.println("+++++++++++++++++++++++++++++++++++++++++");
                System.out.println("La identificacion del productor es: " + producer.getId());
                System.out.println("El nombre del productor es: " + producer.getName() + " " + producer.getLastName());
                if(producer.getNurseryList().isEmpty() != true){
                    System.out.println("El productor posee los siguientes viveros: ");
                    showNurseryData(producer.getNurseryList()); 
                }else{
                    System.out.println("El productor no tiene viveros.");
                }
            }
        }
    }
    public static void showNurseryData(ArrayList<Nursery> nurseryList){
        if(nurseryList.isEmpty() != true){
            for(Nursery nursery: nurseryList){
                System.out.println("*+++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("El nombre del vivero es: " + nursery.getName());
                System.out.println("El codigo del vivero es: " + nursery.getCode());
                System.out.println("La ubicacion del vivero es: " + nursery.getDepartment() + "/"+ nursery.getMunicipality());
                if(nursery.getLaborList().isEmpty() != true){
                    System.out.println("El vivero contine las siguientes labores: ");
                    showLaborData(nursery.getLaborList());
                }else{
                    System.out.println("Este vivero no posee labores.");
                }
            } 
        }else{
            System.out.println("El productor no tiene viveros.");
        }
    }
    public static void showLaborData(ArrayList<Labor> laborList){
        for(Labor labor: laborList){
            System.out.println("---------------------------------------");
            System.out.println("El nombre del proceso es: " + labor.getName());
            System.out.println("La labor es de tipo: " + labor.getType());
            System.out.println("La ultima realizacion de la labor fue: " + labor.getRealizationDate());
            System.out.println("La descripcion de la labor es: " + labor.getDescription());
            if(labor.getList().isEmpty() != true){
                System.out.println("Las labores de control fisico son: ");
                showWeedPhysicalControlData(labor.getList());
            }else{
                System.out.println("Esta labor no tiene labores de control fisico. ");
            }
            if(labor.getProductList().isEmpty() != true){
                System.out.println("Los productos de esta labor son: ");
                showProductControlData(labor.getProductList());
            }else{
                System.out.println("Esta labor no contiene productos de control.");
            }
        }
    }
    public static void showWeedPhysicalControlData(ArrayList<WeedPhysicalControl> controlList){
        for(WeedPhysicalControl control: controlList){
            System.out.println("---------------------------------------------------------------");
            System.out.println("La frecuencia de poda es de: " + control.getPruningFrecuency());
            System.out.println("La ultima ves que se podo fue: " + control.getLastAplication());
        }
    }
    
    public static void showProductControlData(ArrayList<ProductControl> productList){
        for(ProductControl product: productList){
            if(product instanceof FertilizerControl){
                new FactoryMethodPattern.FertilizerFactory().showData(product);
            }else if(product instanceof PestControl){
                new FactoryMethodPattern.PesticideFactory().showData(product);
            }else if(product instanceof FungusControl){
                new FactoryMethodPattern.UnguentFactory().showData(product);
            }
        }
    }
}
