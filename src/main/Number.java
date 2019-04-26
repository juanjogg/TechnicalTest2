package main;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int number = 0;
		
		while(number < 1 || number > 100) {
			try {
					System.out.println("Ingrese un numero entre 1 y 100:");
					number = read.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("Debe ingresar un numero");
					number = 0;
					read.next();
				}
			}

			
		read.close();

		if(number % 2 != 0) {
			System.out.println("Quipux");
			
		}
		else if(number >= 2 && number <= 5) {
			System.out.println("No Quipux");
		}
		else if(number >= 6 && number <= 20) {
			System.out.println("Quipux");
		}
		else {
			System.out.println("No Quipux");
		}
	}

}
