package MethodOverridding;

public class EcommerceApplication {
	//customer can search product
	public void search(String productName) {
		System.out.println("searching by the product name ");
		
	}
	public void search(String productName,String Brand) {
		System.out.println("searching by the product name and brand");
	}
	public void search(String productName,String Brand,int price) {
		System.out.println("searching by the product name,brand and price");
	}
	
	

	public static void main(String[] args) {
		EcommerceApplication S =new EcommerceApplication();
		 S.search("laptop");
		 S.search("laptop","mackbook pro");
		 S.search("laptop","mackbook pro",10000);

	}

}
