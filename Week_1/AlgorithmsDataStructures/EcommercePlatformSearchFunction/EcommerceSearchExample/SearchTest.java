package Week_1.AlgorithmsDataStructures.EcommercePlatformSearchFunction.EcommerceSearchExample;

public class SearchTest {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {

        for (int i = 0; i < products.length; i++) {

            if (products[i].productId == targetId) {
                return products[i];
            }

        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == targetId) {

                return products[mid];

            } else if (products[mid].productId < targetId) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")

        };

        int searchId = 104;

        Product result1 = linearSearch(products, searchId);

        if (result1 != null) {

            System.out.println("Linear Search Found:");
            System.out.println(result1.productName);

        } else {

            System.out.println("Product not found");

        }

        Product result2 = binarySearch(products, searchId);

        if (result2 != null) {

            System.out.println("Binary Search Found:");
            System.out.println(result2.productName);

        } else {

            System.out.println("Product not found");

        }

    }
}
