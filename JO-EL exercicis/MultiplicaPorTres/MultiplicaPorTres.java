import java.util.Scanner;
public class MultiplicaPorTres{
	public static void main(String []args){
		
	/*	int y = 0;
		for (int x = 0; x < 100; ++x){
			System.out.printf ("%3d ", x);	
			y = x % 10;
			if(x==9 || y == 9) System.out.print("\n");
			
		} 
		
		for(int x = 1; x<=100; x++){
			int y = x * x;
			System.out.print( x + ":" + y + " ");
		}
	
	
	Scanner scanner = new Scanner(System.in);
	
	
	int num = scanner.nextInt();
	int numPerTres = num * 3;
	
	System.out.println(numPerTres);
	*/
	
	for(int x = 1, doble = 1; x<=10; x++, doble = doble *2){
		
		System.out.print(x + ":" + doble + " ");
	}
	
	}
}