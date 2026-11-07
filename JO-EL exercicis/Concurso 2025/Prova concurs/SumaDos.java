import java.util.Scanner;

public class SumaDos{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int total = 0;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		total = num1 + num2;
		
		System.out.println(total);
	}
}
