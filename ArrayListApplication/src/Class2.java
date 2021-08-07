import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String name = "";
	
		
		for(int x=1; x <= 10; x++) {
			System.out.println("Enter name number "+x+":");
			name = scan.nextLine();
			list.add(name);
		}
		
		

		//collection shuffle method
        Collections.shuffle(list); 
        //print the shuffled list
        System.out.println("This is the shuffled List : " + list); 
	}
}
