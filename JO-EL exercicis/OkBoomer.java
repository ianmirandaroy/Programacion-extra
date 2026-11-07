import java.util.Scanner;
public class OkBoomer{
	public static void main(String []args){
		
	
	Scanner scanner = new Scanner(System.in);
	
	//int x = scanner.nextInt();
	/*if( x >= 1945 && x<=1965) {
		System.out.println("ok boomer");
	}else{
		System.out.println("nah");*/
		
		for(int x = 0; x<=10; ++x){
			
			if(x != 20) System.out.print( x*2 + ", ");
			if(x == 10) System.out.print(x*2);
		}
	}
	}

