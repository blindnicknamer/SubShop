import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Order{
	private Sandwich s;
	private int ID;
	private String name, time;
	
	public Order(String n, int id) {
		name = n;
		ID = id;
		s = makeSandwich();
	}
	
	public Sandwich makeSandwich() {
		Scanner key = new Scanner(System.in);
		boolean toastOut = true;
		System.out.print("Choose bread: ");
		String bread = key.next();
		System.out.print("Toasted? (y/n): ");
		String toast = key.next();
		key.nextLine();
		System.out.print("Choose meat(s): ");
		String meat = key.nextLine();
		System.out.print("Choose cheese: ");
		String cheese = key.next();
		key.nextLine();
		System.out.print("Choose toppings: ");
		String top = key.nextLine();
		System.out.print("Choose sauce: ");
		String sauce = key.next();
		
		if(toast.equals("y")) {
			toastOut = true;
		}
		if(toast.equals("n")) {
			toastOut = false;
		}
		Sandwich bob = new Sandwich(bread, toastOut, meat, cheese, top, sauce);
		return bob;
	}
	
	
	//public void writeFile() 
	//		  throws IOException {
	//		    String str = toString();
	//		    BufferedWriter writer = new BufferedWriter(new FileWriter("orders.csv", true));
	//		    writer.write(str);
			    
	//		    writer.close();
	//		}
	
	//public String convertToCSV(String[] data) {
	//    return Stream.of(data).map(this).collect(Collectors.joining(","));
	//}
	
	public String toString() {
		return name + ", " + ID + ", ORDER: " + s;
	}
}
