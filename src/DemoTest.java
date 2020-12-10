
interface Interface2 {
  public abstract void add();
  public abstract void testing();
}

 class DemoTest implements Interface2{
	
	
	public  void add(){
		System.out.println("Add");
		
	}
	public void testing(){
		System.out.println("testing");
	}
	public static void main(String args[]) {
		
		DemoTest aut = new DemoTest();
		aut.add();
		aut.testing();
		
	}

	
}