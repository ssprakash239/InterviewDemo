
 interface A {
	
	public void method1();
	public void method2();

}
 class DemoMethod implements A {
	
	public void method1() {
		System.out.println(" Implementation of m1");
	}
	public void method2() {
		System.out.println("Implementation of m2");
	}
	public static void main(String args[]) {
		DemoMethod demo = new DemoMethod();
		demo.method1();
	}
}
