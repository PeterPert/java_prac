import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public boolean removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                products.remove(i);
                return true;
            }
        }
        return false;
    }

    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void printCart() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        System.out.println("=== корзина ===");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
        System.out.printf("Итого: %.2f руб.\n", getTotal());
    }
}