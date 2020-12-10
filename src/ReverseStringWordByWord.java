
public class ReverseStringWordByWord {

	public static void main(String[] args) {
		
		
		ReverseStringWordByWord rsd = new ReverseStringWordByWord();
		String str = "This is Lenovo PC";
		System.out.println("Reverse Of String after WordByWord is: "+ rsd.reversestr(str) );
	}
	 
	static String reversestr(String str)  {
		String r = "";
		for(int i=str.length();i>0;--i)        //execute until condition i>0 becomes false  
		{  
		r=r+(str.charAt(i-1));   
		}  
		
		
		return r;
	}
}
