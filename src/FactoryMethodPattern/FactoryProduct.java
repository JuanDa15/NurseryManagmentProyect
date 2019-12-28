package FactoryMethodPattern;

import Models.ProductControl;

public interface FactoryProduct {
    public ProductControl createProduct();
    public void showData(ProductControl product);
}
