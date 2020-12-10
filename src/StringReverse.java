
public class StringReverse {

	public static void main(String[] args) {
		String str = "This is lenovo pc";
		String reverse = "";
		int length = str.length();
		for(int i = length-1 ; i>=0;i--) 
			reverse = reverse + str.charAt(i);
		
		
		System.out.println("Reverse of the string: " + reverse);
	}

}
