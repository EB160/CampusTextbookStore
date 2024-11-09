import java.util.HashMap;

public class StoreInventory {
	private HashMap<Integer, Book> inventory;
	
	public StoreInventory() {
		inventory = new HashMap<>();
	}
	
	
	public void addBook(int sku, String title, double price, int quantity) {
		if (inventory.containsKey(sku)) {
			System.out.println("Error: Book already exists.");
		} else {
			inventory.put(sku, new Book(sku, title, price, quantity));
			System.out.println("Book has been added");
		}
	}
	
	public void removeBook(int sku) {
		if(!inventory.containsKey(sku)) {
			System.out.println("Error: Book does not exist");
		}else {
			inventory.remove(sku);
			System.out.println("Book has been removed");
		}
	}
		
	public void displayBook(int sku) {
		Book book = inventory.get(sku);
		if(book != null) {
			System.out.println(book);
		} else {
			System.out.println("Error: Book was not found");
		}
	}
	
	public void displayAllBooks() {
		if(inventory.isEmpty()) {
			System.out.println("Error: Inventory is empty");
		} else {
			for(Book book :inventory.values()) {
				System.out.println(book);
			}
		}
	}
	
	
}
