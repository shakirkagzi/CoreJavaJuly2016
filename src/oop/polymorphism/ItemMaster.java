package oop.polymorphism;

public class ItemMaster {

	public static void main(String[] args) {
		ItemDatabase shoe = new ItemDatabase();
		shoe.price=100;
		System.out.println(shoe.price);
		
		ItemDatabase chapple = new ItemDatabase();
		chapple.price=150;
		System.out.println(chapple.price);
		
		System.out.println(shoe.price);
		
	}

}
