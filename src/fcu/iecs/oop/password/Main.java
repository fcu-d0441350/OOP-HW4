package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		PasswordEncorder encorder=new PasswordEncorder();
		Scanner scanner=new Scanner(System.in);
		String Exit="exit";
		boolean i;
		while(true) {
			System.out.println("input a string");
			String password;
			password=scanner.next();
			i=password.equalsIgnoreCase(Exit);
			if(i)
				break;
			password=encorder.encode(password);
			System.out.println(password);
		}
		scanner.close();

	}

}
