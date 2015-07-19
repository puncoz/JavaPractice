package javaFileIO;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaFileIOStandardStream {

	public JavaFileIOStandardStream() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) throws IOException {
		InputStreamReader cin = null;
		
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to exit.");
			char c;
			do {
				c = (char) cin.read();
				System.out.println(c);
			} while(c != 'q');
		} finally {
			if(cin != null) {
				cin.close();
			}
		}
	}

}
