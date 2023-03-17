/**
 * Represents a gizmo currently supplied at Gizmo Group LLC
 */
public class Gizmo implements Comparable<Gizmo>{
    private final String name;
    private final int productNumber;

    private final int year;
    private final int quantity;
    private final double price;

    /**
     * Creates a new gizmo
     *
     * @param name The name of the planet
     * @param productNumber The id number corresponding to a gizmo
     * @param year The year the gizmo was created
     * @param quantity how much of the gizmo is in stock
     * @param price the cost of the gizmo
     */
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

    @Override
    public String toString() {
        return "Gizmo{" +
                "name='" + name + '\'' +
                ", productNumber=" + productNumber +
                ", year=" + year +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
