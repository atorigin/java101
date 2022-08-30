

public class Shirt {
    public int shirtID = 0;
    public String description = "-description required-";
    public char colorCode = 'U';
    public double price = 0.0;
    public int quantityInStock = 0;

    public void display() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color code: " + colorCode);
        System.out.println("Shirt price: " + price);
        System.out.println("Quantity In Stock: " + quantityInStock);
        System.out.println("------ split ------");
    }
}