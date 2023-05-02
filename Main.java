import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System;

public class Main {
	public static void main( String args[] ) throws IOException
	{
		Queue<Order> orders = new LinkedList<Order>();
		String all = "";
		int x = 1;
		while(x<2) {
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = key.next();
		int ID = 0;
		do{
			try {
				System.out.print("Enter ID: ");
				ID = key.nextInt();
			}
			catch(final InputMismatchException e) {
				System.out.println("Please enter an integer");
			}
			key.nextLine();
		}while(ID == 0);
		Order test = new Order(name, ID);
		orders.add(test);
		
		System.out.print("Another order? (1=yes, 2=no): ");
		x = key.nextInt();
		
		}
		for(Order o:orders) {
			all += o.toString() + "\n";
		}
		FileWriter writer = new FileWriter("src/orders.csv");
	    writer.write(all);    	
	    writer.close();
	}
	
}
