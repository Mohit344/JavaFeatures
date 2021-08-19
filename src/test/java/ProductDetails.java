//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * This class help in  providing the Product details
// * @author Mohit Jaiswal
// */
//
//
//public class ProductDetails {
//    List<Product> productList = new ArrayList<Product>();
//
//
//    public ProductDetails(){
//
//        productList.add(new Product("Lloyd 1.5 Ton 5 Star","AC","₹35,990"));
//        productList.add(new Product("Mi 100 cm (40 Inches) Full HD","TV","₹23,999"));
//        productList.add(new Product("Whirlpool 190 L 3 Star","Refrigerator","₹12,740"));
//        productList.add(new Product("iPhone 11","Mobile","₹50,999"));
//        productList.add(new Product("Nokia 110 4G","Mobile","₹2,799"));
//        productList.add(new Product("MacBook Air","Laptop","₹1,12,900"));
//        productList.add(new Product("Sony Bravia 139 cm (55 inches)","TV","₹85,490"));
//        productList.add(new Product("Samsung Galaxy A7","Tablet","₹12,799"));
//        productList.add(new Product("Dell E4300","Laptop","₹27,999"));
//        productList.add(new Product("OnePlus 6T","Mobile","₹28,999"));
//        productList.add(new Product("Oppo A74","Mobile","₹17,990"));
//        productList.add(new Product("Sony Vaio","Laptop","₹22,100"));
//    }
//
//    public static void main(String[] args) {
//        ProductDetails details = new ProductDetails();
//        details.productCategoryDetails();
//        System.out.println("***********************");
//        details.sortProductPrice();
//    }
//
//    /**
//     * This method help in fetching the product category details
//     * @author Mohit
//     *
//     */
//
//    public void productCategoryDetails(){
//        String productCategory="Mobile";
//        // filtering out all the mobile products and their names and associated price.
//        List<Product> mobileProductList=productList.stream().filter(product -> product.category.equals(productCategory)).collect(Collectors.toList());
//        System.out.println(mobileProductList.size());
//
//        // getting all the mobile product list using loop
//        for (Product product:mobileProductList){
//            System.out.println(product.getCategory()+", "+product.getPrice()+", "+product.getName());
//        }
//    }
//
//    /**
//     * This method help in sorting and showing the product price with associated name and category
//     * @author Mohit
//     */
//
//    public  void sortProductPrice(){
//        List<Product> sortedPrice= productList.stream().filter(product -> product.getCategory().equalsIgnoreCase("Laptop"))
//        .sorted(Comparator.comparing(Product::getPrice))
//        .sorted(Comparator.comparingInt(product->product.getPrice().length())).collect(Collectors.toList());
//
//     for (Product product:sortedPrice){
//         System.out.println(product.getCategory()+","+product.getPrice()+","+","+product.getName());
//     }
//    }
//    }
//
