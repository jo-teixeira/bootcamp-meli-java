import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseExtraC {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> productList = makeProductList();
        sumPrices(productList);
    }

    public static ArrayList<Product> makeProductList(){
        ArrayList<Product> productList = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            System.out.println("Entre com o nome do produto " + (i + 1) + ":");
            String productName = input.nextLine();
            System.out.println("Entre com o preco do produto " + (i + 1) + ":");
            Double productPrice = input.nextDouble();
            System.out.println("Entre com a quantidade do produto " + (i + 1) + ":");
            Integer productQuantity = input.nextInt();
            input.nextLine();

            productList.add(new Product(productName, productPrice, productQuantity));
        }
        return productList;
    }

    private static void sumPrices(ArrayList<Product> productsList){
        double finalPrice = 0.0;
        for(Product product : productsList){
            System.out.println("Nome: " + product.getName());
            System.out.println("Preco: R$" + product.getValue());
            System.out.println("Quantidade: \n" + product.getQuantity());
            finalPrice +=(product.getValue() * product.getQuantity());
        }
        System.out.println("\n Preco final da compra: " + finalPrice);
    }

    public static class Product{
        private final String name;
        private final Double value;
        private final Integer quantity;

        public Product(String name, Double value, Integer quantity) {
            this.name = name;
            this.value = value;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public Double getValue() {
            return value;
        }

        public Integer getQuantity() {
            return quantity;
        }
    }
}

