import java.util.Scanner;
public class IgualandoCopas{
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		//x = quantitat de copes
		//y = quantitat de líquid a cada copa
		
		
		int x = 1;
		int y = 0;
		int falta = 0;
		String resultat = "";
		int maxNumber = 0;
		
		//Cambiar a multiplicar numero de copas por el numero maximo y restar la suma de todo
		
		
		while ( x != 0){
			
			System.out.println("I'm detecting x");
			x = scanner.nextInt();
			
			for( int count=0; count<x; ++count){
				System.out.println("I'm detecting y");
				y = scanner.nextInt();
				
				maxNumber= Math.max(maxNumber, y); 
				
				falta = falta + (maxNumber - y);
			}
			
			if (x!=0) resultat = resultat + "\n" + falta;
			maxNumber = 0;
			falta = 0;
		}
	
		System.out.print(resultat);
	}
}
			
			