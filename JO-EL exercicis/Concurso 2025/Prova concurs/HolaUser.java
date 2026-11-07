import java.util.Scanner;

public class HolaUser{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String nom = "";
		
		nom = scanner.nextLine();
		
		System.out.println("Hola, " + nom);
	}
}
