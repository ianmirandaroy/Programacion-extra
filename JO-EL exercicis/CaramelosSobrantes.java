import java.util.Scanner;
public class CaramelosSobrantes{
	public static void main(String []args){
		
	
	Scanner scanner = new Scanner(System.in);
	
	
	int x = scanner.nextInt();
	int y = scanner.nextInt();
	int total = x % y;
	System.out.println(total);
	}
}