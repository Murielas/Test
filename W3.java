import java.util.Scanner;
public class W2 {
    public static void main(String args[]) {
		int sum = 0;
		for ( int i = 0; i < 101; i++) {
			sum = sum + i;
		}
		System.out.println("Задание 1: " + sum);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Напиши число:");
		int fact = 1;
		for ( int i = scanner.nextInt(); i > 0; i--) {
			fact = fact * i;
		}
		System.out.println("Задание 2: " + fact);
		
		
		for ( int i = 1; i < 21; i++) {
			if ( i % 2 == 0) {
				System.out.println(i + " - Чётное");
			} else {
				System.out.println(i + " - Нечётное");
			}
		}
		
			
		
			
	}
}