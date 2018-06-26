package p03_shopping_spree;

class Product {
    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    private void setName(String name) {
        if (name.replaceAll(" ", "").equals("")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }else if (name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setCost(int cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }
}
