package ca.demo.salestool;

/**
 * Add new statement
 */
public class SalesData {
	int data[] = {-1, 0, 4, 42, 84};
	
	public void display() {
		System.out.println("Data: ");

		int sum = 0;
		for (int i: data) {
			System.out.println("Next value: " + data[i]);
			sum += i;
		}
		
		System.out.println("Sum is: " + sum);
		System.out.println("Do not change");
	}

}
