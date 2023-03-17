/**
 * Represents a gizmo currently supplied at Gizmo Group LLC
 */
public class Gizmo implements Comparable<Gizmo>{
    private final String name;
    private final int productNumber;

    private final int year;
    private final int quantity;
    private final double price;

    public Gizmo(String name, int productNumber, int year, int quantity, double price) {
        this.name = name;
        this.productNumber = productNumber;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public int getYear() {
        return year;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Gizmo o) {
        return Integer.compare(this.getYear(), o.getYear());
    }
}
