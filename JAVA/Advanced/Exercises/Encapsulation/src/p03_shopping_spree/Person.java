package p03_shopping_spree;

import java.util.LinkedList;

public class Person {
    private String name;
    private int money;
    private LinkedList<Product> products;

    public Person(String name, int money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new LinkedList<>();
    }

    public LinkedList<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.replaceAll(" ", "").equals("")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }else if (name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(int money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    private boolean canAfford(int cost) {
        return this.money >= cost;
    }

    public boolean updateBagAndMoney(Product product) {
        if (this.canAfford(product.getCost())) {
            this.products.add(product);
            this.money -= product.getCost();
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" - ");
        if (this.products.size() > 0) {
            for (Product product : products) {
                sb.append(product.getName()).append(", ");
            }
            sb.replace(sb.length()-2, sb.length(), "");
        }else {
            sb.append("Nothing bought");
        }
        return sb.toString();
    }
}
