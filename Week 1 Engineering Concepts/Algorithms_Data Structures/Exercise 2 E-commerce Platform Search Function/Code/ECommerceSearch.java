import java.util.*;

public class ECommerceSearch {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

   
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0){
                 return products[mid];
            }
            else if (cmp < 0){
                left = mid + 1;
            } 
            else{
                right = mid - 1;
            } 
        }
        return null;
    }

    
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "iPhone", "Electronics"),
            new Product(102, "Samsung TV", "Electronics"),
            new Product(103, "Nike Shoes", "Footwear"),
            new Product(104, "Dell Laptop", "Computers"),
            new Product(105, "Sony Headphones", "Accessories")
        };

        // Linear Search 
        System.out.println("Linear Search for 'Dell Laptop':");
        Product result1 = linearSearch(products, "Dell Laptop");
        System.out.println(result1 != null ? result1 : "Product not found");

        // Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search for 'Dell Laptop':");
        Product result2 = binarySearch(products, "Dell Laptop");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
