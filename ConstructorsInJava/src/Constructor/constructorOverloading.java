package Constructor;

public class constructorOverloading {
	public constructorOverloading(int a,int b) {
		int c=a+b;
		System.out.println("Summation is:"+c);
		
	}
	public constructorOverloading(double a,double b) {
         double c=a+b;
         System.out.println("Summation is:"+c);
         }
	public void display() {
		 System.out.println("constructor overloadeed sucessfully");
	}
	
	public static void main(String[] args) {
		constructorOverloading obj1 = new constructorOverloading(10,20);
		constructorOverloading obj2 =new constructorOverloading(20.55,20.01);
		obj2.display();
		obj1.display();
	}

}
