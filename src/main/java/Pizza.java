public class Pizza implements Food {
    String name;
    double Price;
    String Description;

    public Pizza(String name, double price, String description) {
        this.name = name;
        Price = price;
        Description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return Price;
    }

    public String getDescription() {
        return Description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
