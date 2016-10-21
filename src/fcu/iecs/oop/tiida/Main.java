package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int num,i;
		NissanTiida nissan=new NissanTiida();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a number");
		num=scanner.nextInt();
		for(i=1;i<=num;i++) {
			nissan.Tiida(i);
			System.out.printf("\n");
		}
		scanner.close();		

	}

}
