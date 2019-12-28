package Crud;
import Models.ProductControl;

public class SelectProduct {
    public static ProductControl select(int type){
        ProductControl product = new ProductControl();
        switch(type){
            case 1:
                product = new FactoryMethodPattern.FertilizerFactory().createProduct();
                break;
            case 2:
                product = new FactoryMethodPattern.PesticideFactory().createProduct();
                break;
            case 3:
                product = new FactoryMethodPattern.UnguentFactory().createProduct();
                break;
        }
        return product;
    }
}
