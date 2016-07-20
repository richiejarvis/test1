

public class TestSourceCode {

	int a = 0;
	
	public TestSourceCode() {
		a=1;
	}
	
	public static void main(String[] args) {
		TestSourceCode tsc = new TestSourceCode();
		tsc.start();
		// another comment thing here....
		
		System.out.println("test");
		
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("line 5");
	}
	
	private void start() {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("line 5");
	}

}
