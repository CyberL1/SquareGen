import java.util.Scanner;

public class Gen {
	public static void main(String[] args)  {
		System.out.println("Select height");
		Scanner scan = new Scanner(System.in);
		
		int scan1 = scan.nextInt();
		
		System.out.println("Select width");
		int scan2 = scan.nextInt();
		
		scan.close();
		
		for(int i = 0; i < scan1; i++) {
			for(int j = 0; j < scan2; j++) {
				System.out.print("#");
			}
			
			System.out.print('\n');
		}
	}
}