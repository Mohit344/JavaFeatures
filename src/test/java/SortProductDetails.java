//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
///**
// * This class shows the sorted product details
// * @author Mohit
// */
//public class SortProductDetails {
//    List<Product> productList;
//
//    public SortProductDetails() {
//        ProductDetails productDetails = new ProductDetails();
//        productList = productDetails.getProductsDetailsList();
//    }
//
//    String[] name = new String[productList.size()];
//    String[] category = new String[productList.size()];
//    Integer[] price = new Integer[productList.size()];
//
//    ArrayList<String> nameList = new ArrayList<>();
//    ArrayList<String> categoryList = new ArrayList<>();
//    ArrayList<Integer> priceList = new ArrayList<>();
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        ProductDetails details = new ProductDetails();
//        SortProductDetails product = new SortProductDetails();
//        details.getProductsDetailsList();
//        product.sortProductDetails();
//    }
//
//    /**
//     * This Method is generic method , which sort the product Details
//     *
//     * @param list
//     * @param <T>
//     * @return
//     */
//    public static <T> List<T> sortProduct(List<T> list) {
//        Collections.sort();
//
//    }
//
//    /**
//     * This is generic method, which show the sorted product details
//     *
//     * @param product
//     * @param <T>
//     */
//    public static <T> void showSortedProduct(List<T> product) {
//        product = sortProduct(product);
//        for (int index = 0; index < product.size(); index++) {
//            System.out.println(product.get(index));
//        }
//    }
//
//    /**
//     * This method convert the list to array and sort the product details
//     */
//    public void sortProductDetails() {
//        productList.forEach(product -> {
//            nameList.add(product.getName().toUpperCase());
//            categoryList.add(product.getCategory());
//            String priceStr = product.getPrice().replaceAll("[₹,]", "");
//            priceList.add(Integer.parseInt(priceStr));
//        });
////        name = nameList.toArray(name);
////        category = categoryList.toArray(category);
////        price = priceList.toArray(price);
//        System.out.println("***sorting the product name***");
//        showSortedProduct(nameList);
//        System.out.println("***sorting the product category***");
//        showSortedProduct(categoryList);
//        System.out.println("***sorting the product price***");
//        showSortedProduct(priceList);
//    }
//
//}
//
