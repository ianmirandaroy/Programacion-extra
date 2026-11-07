import java.util.Scanner;

public class manananohayclase{
	public static void main(String [] args){
	
	Scanner scanner = new Scanner(System.in);
	int num = 0;
	int times = 0;
	int daysWithoutClass = 0;
	int max = 0;
	String clase = "";
	
	num = scanner.nextInt();
	
	scanner.nextLine();
	
	while(times != num) {
		
		clase = scanner.nextLine();
		times++;
		
		if (clase.equals("N")) ++daysWithoutClass;
		max = Math.max(max, daysWithoutClass);
		if (clase.equals("S")) daysWithoutClass = 0;
	}
	System.out.println(max);
	}
}

	