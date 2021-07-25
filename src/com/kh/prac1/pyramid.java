import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			for(int j=3; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		Scanner sc = new Scanner(System.in);
		int stars = sc.nextInt();
		
		for(int i=0; i < stars/2; i++) {
			for(int j=stars/2; j > i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=stars/2; i >= 0; i--) {
			for(int j=stars/2; j > i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
