package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("milk", 10);
        products[1] = new Product("bread", 4);
        products[2] = new Product("egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }

    public static int indexOfNull(Product[] products) {
        int counter = -1;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                counter = i;
                break;
            }
        }
        return counter;
    }
}
