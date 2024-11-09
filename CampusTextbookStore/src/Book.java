
public class Book {
	private int sku;
	private String title;
	private double price;
	private int quantity;
	
	public Book(int sku, String title, double price, int quantity) {
		this.sku = sku;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getSku() {
		return sku;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return String.format("Sku:%d Title:%s Price:$%.2f Quantity:%d", sku, title, price, quantity);
	}
}
