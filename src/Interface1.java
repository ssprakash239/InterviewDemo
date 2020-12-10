
 interface Interface1 {
  public abstract void add();
  public abstract void testing();
}

 class Automation implements Interface1{
	
	
	public  void add(){
		System.out.println("Add");
		
	}
	public void testing(){
		System.out.println("testing");
	}
	public static void main(String args[]) {
		
		Automation aut = new Automation();
		aut.add();
		aut.testing();
		
	}

	
}
