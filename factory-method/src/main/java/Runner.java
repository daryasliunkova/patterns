public class Runner {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.createProduct("B");
        product.writeName("Darya");

        /**
         * Factory method createStatement by type of Driver
         * connection = DriverManager.getConnection (url, username, password );
         * statement  = connection.createStatement();
         */
    }
}
