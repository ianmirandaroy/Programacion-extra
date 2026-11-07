import java.util.Scanner;
public class ElCuadradoDelCinco{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		long x = scanner.nextInt();
		
		String resultados = "";
		
		for (long i = 1; i<=x; i++){
			
			long decenas = scanner.nextLong() / 10;
			
			if(decenas == 0) resultados = "25";
			else resultados = decenas * (decenas +1) + "25";
			
			
			System.out.println(resultados);
		}
		
	}
}
		