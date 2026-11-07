import java.util.Scanner;
public class BuscarParejas{
	public static void main(String []args){
		
	
	Scanner scanner = new Scanner(System.in);
	
	
	int x = scanner.nextInt();
	int y = scanner.nextInt();
	int z = scanner.nextInt();

	if(x == y || x == z || y == z) {
		System.out.println("SI");
	}else{
		System.out.println("NO");
	}

	
	
	
	
	}
}
