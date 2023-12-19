package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Aplication {

	public static void main(String[] args) {

		Random rand = new Random();
		int randomNumber = rand.nextInt(100) + 1;
		int numGuesses = 5;
		Scanner scanner = new Scanner(System.in);

		while (numGuesses > 0) {
			System.out.println("Pick a number between 1 and 100.");
			int guess = scanner.nextInt();

			if (guess < 1 || guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again.");
				continue;
			}

			if (guess == randomNumber) {
				System.out.println("You win!");
				scanner.close();
				return;
			} else if (guess < randomNumber) {
				System.out.println("Please pick a higher number.");
			} else {
				System.out.println("Please pick a lower number.");
			}

			numGuesses--;
		}
		System.out.println("You lose, the number to guess was " + randomNumber + ".");

		scanner.close();
	}
}
