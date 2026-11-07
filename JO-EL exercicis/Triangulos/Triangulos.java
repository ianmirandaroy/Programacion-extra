import java.util.Scanner;
public class Triangulos{
	public static void main(String []args){
		
	
	Scanner scanner = new Scanner(System.in);
	
	
	double a = scanner.nextInt();
	double b = scanner.nextInt();
	double area = (b * a) / 2;
	
	System.out.println(area);
	}
}