public class Main {
    public static void main(String[] args) {
        // Создание товаров
        Product milk = new Product("Молоко", 85.50);
        Product bread = new Product("Хлеб", 45.00);
        Product eggs = new Product("Яйца", 120.75);
        Product cheese = new Product("Сыр", 250.30);

        // Создание корзины
        Cart cart = new Cart();

        // Добавление товаров в корзину
        cart.addProduct(milk);
        cart.addProduct(bread);
        cart.addProduct(eggs);
        cart.addProduct(cheese);

        // Показать корзину и итоговую сумму
        System.out.println("Корзина после добавления товаров:");
        cart.printCart();
        System.out.println();

        // Удалить один товар
        String productToRemove = "Хлеб";
        System.out.println("Удаляем товар: " + productToRemove);
        if (cart.removeProduct(productToRemove)) {
            System.out.println("Товар успешно удален.\n");
        } else {
            System.out.println("Товар не найден в корзине.\n");
        }

        // Снова показать корзину
        System.out.println("Корзина после удаления товара:");
        cart.printCart();
    }
}