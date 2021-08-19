import java.util.ArrayList;
import java.util.List;

/**
 * This class shows the total price detail and filter the product according to price
 */
public class ShowProductsPriceDetails {
    public static void main(String[] args) {
        ProductDetails productDetails = new ProductDetails();
        List<Product> productsList = productDetails.getProductsDetailsList();

        System.out.println("***Total price of products***");
        ProductPriceDetails.productsTotalPrice((ArrayList<Product>) productsList);
        System.out.println("***Product details which are greater than 50000 in price***");
        ProductPriceDetails.showProductsWithPriceFilter((ArrayList<Product>) productsList);
    }
}