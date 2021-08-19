import java.util.ArrayList;

/**
 * This is interface class of product price details
 */
public interface ProductPriceDetails {
    ArrayList<Integer> priceList = new ArrayList<>();

    /**
     * This Method show the total price of all the products
     *
     * @param productsList
     */
    static void productsTotalPrice(ArrayList<Product> productsList) {
        productsList.forEach(product -> {
            String priceStr = product.getPrice().replaceAll("[₹,]", "");
            priceList.add(Integer.parseInt(priceStr));
        });
        int totalPrice = priceList.stream().mapToInt(price -> price).sum();
        System.out.println("The total sum of products price " + "₹" + totalPrice);
    }

    /**
     * This method filter and show the Product which are greater than ₹50000 in price
     *
     * @param productsList
     */
    static void showProductsWithPriceFilter(ArrayList<Product> productsList) {
        int price = 50000;
        productsList.forEach(product ->
                {
                    String priceStr = product.getPrice().replaceAll("[₹,]", "");
                    if (Integer.parseInt(priceStr) > price) {
                        System.out.println(product.getPrice() + ", " + product.getCategory() + "," + product.getName());
                    }
                }
        );
    }
}
