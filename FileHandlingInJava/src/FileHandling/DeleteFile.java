package FileHandling;
import java.io.File;
public class DeleteFile {

	public static void main(String[] args) {
		
File myObj =new File("/Users/souravkumar/Downloads/SK");
   if(myObj.delete()) {
	   System.out.println("Delete the file");
   }else {
	   System.out.println("Failed to Delete the file");
   }
	}

}
