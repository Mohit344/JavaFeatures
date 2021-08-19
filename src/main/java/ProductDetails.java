import java.util.ArrayList;
import java.util.List;

/**
 * This class consist of details of product
 */
public class ProductDetails {

    /**
     * This method set the product list
     */

    public List<Product> getProductsDetailsList() {
        List<Product> productList = new ArrayList<Product>();

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();
        Product product7 = new Product();
        Product product8 = new Product();
        Product product9 = new Product();
        Product product10 = new Product();
        Product product11 = new Product();
        Product product12 = new Product();

        product1.setName("Lloyd 1.5 Ton 5 Star");
        product1.setCategory("AC");
        product1.setPrice("₹35,990");
        productList.add(product1);

        product2.setName("Mi 100 cm (40 Inches) Full HD");
        product2.setCategory("TV");
        product2.setPrice("₹23,999");
        productList.add(product2);

        product3.setName("Whirlpool 190 L 3 Star");
        product3.setCategory("Refrigerator");
        product3.setPrice("₹12,740");
        productList.add(product3);

        product4.setName("iPhone 11");
        product4.setCategory("Mobile");
        product4.setPrice("₹50,999");
        productList.add(product4);

        product5.setName("Nokia 110 4G");
        product5.setCategory("Mobile");
        product5.setPrice("₹2,799");
        productList.add(product5);

        product6.setName("MacBook Air");
        product6.setCategory("Laptop");
        product6.setPrice("₹1,12,900");
        productList.add(product6);

        product7.setName("Sony Bravia 139 cm (55 inches)");
        product7.setCategory("TV");
        product7.setPrice("₹85,490");
        productList.add(product7);

        product8.setName("Samsung Galaxy A7");
        product8.setCategory("Tablet");
        product8.setPrice("₹12,799");
        productList.add(product8);

        product9.setName("Dell E4300");
        product9.setCategory("Laptop");
        product9.setPrice("₹27,999");
        productList.add(product9);

        product10.setName("OnePlus 6T");
        product10.setCategory("Mobile");
        product10.setPrice("₹28,999");
        productList.add(product10);

        product11.setName("Oppo A74");
        product11.setCategory("Mobile");
        product11.setPrice("₹17,990");
        productList.add(product11);

        product12.setName("Sony Vaio");
        product12.setCategory("Laptop");
        product12.setPrice("₹22,100");
        productList.add(product12);

        return productList;
    }
}

