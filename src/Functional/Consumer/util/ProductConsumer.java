package Functional.Consumer.util;

import Functional.Consumer.entities.Product;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductConsumer implements Consumer<Product> {


    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
