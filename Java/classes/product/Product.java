package Java.classes.product;

public class Product {
    private int id;
    private String name;
    public Product(int id, String name) {
        this.name = name;
        this.id = id;

    }
    public Product(String string) {
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
