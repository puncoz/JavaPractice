package splitString;

public class splitString2 {

	public splitString2() {
		// TODO Auto-generated constructor stub
	}
	
	public void splitStr() {
		String strWithSpace = "Java Beginners Tutorial";
		/*
		 * Split method works as if by invoking the two-argument split method with the given expression.
		 */
		String[] tokenSpace = strWithSpace.split(" ");
		for(int x=0; x<tokenSpace.length; x++) {
			System.out.println(tokenSpace[x]);
		}
	}

}
