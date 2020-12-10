
public class SwappingWithOutThirdVariable
{

	public static void main(String[] args) {
		int x=5;
		int y=6;
		System.out.println("Before swapping values of x is:"+x);
		System.out.println("Before swapping values of y is:"+y);
		x = x+y;
		y = x-y;
		x= x-y;
		System.out.println("After swapping values of x is:"+x);
		System.out.println("After swapping values of y is:"+y);
		
	}

}
