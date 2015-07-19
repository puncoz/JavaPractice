package javaSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {

	public SerializationClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.firstName = "Puncoz";
		emp.lastName = "Nepal";
		
		try {
			FileOutputStream fileOut = new FileOutputStream("../employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(emp);
			out.close();
			fileOut.close();
			
			System.out.println("Serialized data is saved in ./employee.txt file");
		} catch(IOException i) {
			i.printStackTrace();
		}
	}

}
