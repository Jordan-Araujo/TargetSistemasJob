package program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);	
		try {
			System.out.println("Which exercise do you want to see?(01, 02 or 05)");
			int exerciseNumber = sc.nextInt();
			if(exerciseNumber == 01) {
				System.out.println("Question 01:");
				Question01 ex1 = new Question01();
				int result = ex1.nextNumber();
				System.out.println("Result: " + result);
			}
			else if(exerciseNumber == 02) {
				System.out.println("Question 02:");
				System.out.println("Enter a integer value: ");
				int value = sc.nextInt();
				Question02 ex2 = new Question02();
				boolean result = ex2.fibonacci(value);
				System.out.println("The value can be found in the fibonacci sequence: " + result);
			}
			else if(exerciseNumber == 05) {
				System.out.println("Question 05");
				System.out.println("Enter a word:");
				String word = sc.next();
				Question04 ex5 = new Question04(word);
				String result = ex5.reverse(word);
				System.out.println(result);
			}
					
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("Error: Enter a valid number!");
		}
		finally {
			sc.close();
		}	
	}
}