package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean sell(int amount) {
        if (amount > 0 && amount <= quantity) {
            this.quantity -= amount;
            return true;
        }
        return false;
    }

    public void setPrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %-15s | Preço: R$%7.2f | Estoque: %d", name, price, quantity);
    }
}
