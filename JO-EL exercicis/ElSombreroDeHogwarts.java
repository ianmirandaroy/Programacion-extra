import java.util.Scanner;
public class ElSombreroDeHogwarts{
	public static void main(String []args){
		
	
	Scanner scanner = new Scanner(System.in);
	
	String x = scanner.nextLine();
	
	if(x.equals("Coratge")){
		System.out.println("Gryffindor");
	}else if(x.equals("Coneixement")){
		System.out.println("Ravenclaw");
	}else if(x.equals("Ambicio")){
		System.out.println("Slytherin");
	}else {
		System.out.println("Hufflepuff");
	}

	}
}
