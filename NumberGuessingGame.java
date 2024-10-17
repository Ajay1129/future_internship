package com.project_1;

	import java.util.Random;
	import java.util.Scanner;

	import java.util.Random;
	import java.util.Scanner;

	public class NumberGuessingGame {
	    
	    public static void main(String[] args) {
	        playGame();
	    }

	    private static void playGame() {
	        Random random = new Random();
	        Scanner scanner = new Scanner(System.in);
	        
	        int targetNumber = random.nextInt(100) + 1;
	        int guess = 0;
	        int attempts = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

	        while (guess != targetNumber) {
	            guess = getUserGuess(scanner);
	            attempts++;
	            provideFeedback(guess, targetNumber);
	        }

	        System.out.println("Congratulations! You've guessed the number " + targetNumber + " in " + attempts + " attempts.");
	        scanner.close();
	    }

	    private static int getUserGuess(Scanner scanner) {
	        System.out.print("Enter your guess: ");
	        return scanner.nextInt();
	    }

	    private static void provideFeedback(int guess, int targetNumber) {
	        if (guess < targetNumber) {
	            System.out.println("Too low! Try again.");
	        } else if (guess > targetNumber) {
	            System.out.println("Too high! Try again.");
	        }
	    }
	}

