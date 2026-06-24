import java.util.*;

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, String target) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(target)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String target) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison =
                    products[mid].productName.compareToIgnoreCase(target);

            if (comparison == 0)
                return products[mid];

            if (comparison < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Tablet", "Electronics")
        };

        Product result1 = linearSearch(products, "Watch");

        System.out.println("Linear Search Result:");
        System.out.println(result1);

        Arrays.sort(products,
                Comparator.comparing(p -> p.productName));

        Product result2 = binarySearch(products, "Watch");

        System.out.println("\nBinary Search Result:");
        System.out.println(result2);
    }
}