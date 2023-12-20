package products.logic;

import products.data.Product;
import products.data.ProductType;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductService {

    //Wandle eine Liste von Produktpreisen in Preise mit Mehrwertsteuer um.
    public List<Double> getProductPricesWithVat(List<Product> products) {
        return products.stream()
                .map(product -> product.priceWithoutVat() * 1.2)
                .collect(Collectors.toList());

    }

    //Finde das teuerste Produkt in einer Produktliste.
    public Optional<Product> getMostExpensiveProduct(List<Product> products) {
        return products.stream()
                .max(Comparator.comparingDouble(Product::priceWithoutVat));
    }

    // Finde alle einzigartigen Kategorien aus einer Produktliste.
    public Set<ProductType> getUniqueProducts(List<Product> products) {
        return products.stream().map(Product::productType).collect(Collectors.toSet());
    }
    // Finde das Gesamtgewicht aller Produkte in einem Lager.
    public double getTotalWeight (List<Product> products) {
        return products.stream().mapToDouble(Product::priceWithoutVat).sum();
}


}
