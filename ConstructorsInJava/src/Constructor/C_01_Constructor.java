package Constructor;

public class C_01_Constructor {
	public C_01_Constructor() {
		System.out.print("This is the constructoe block");
	}
	public void method() {
		System.out.print("This is the method  block");
	}

	public static void main(String[] args) {
		
		C_01_Constructor obj =new C_01_Constructor();
		// constructor block will automatically invoked
		
		//Need to call explicitly for the method
		obj.method();
	}

}
