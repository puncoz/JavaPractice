package javaSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {

	public DeserializationClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		Employee emp = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("../employee.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			emp = (Employee)in.readObject();
			
			in.close();
			fileIn.close();
		} catch(IOException i) {
			i.printStackTrace();
			return;
		} catch(ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		
		System.out.println("Deserializing Employee...");
		System.out.println("First name of Employee: " + emp.firstName);
		System.out.println("Last name of Employee: " + emp.lastName);
	}

}
