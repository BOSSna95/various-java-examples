package org.example.logic;

import org.example.data.Product;

import java.util.List;
import java.util.Optional;

public class SearchService {

    public List<Product> getProductsCheaperThan (List<Product> products, double price) {
        return products.stream().
                filter(product -> product.price()<price).
                toList();
    }


}
