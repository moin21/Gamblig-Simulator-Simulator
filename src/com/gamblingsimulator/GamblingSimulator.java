package com.gamblingsimulator;

import java.util.Random;
import java.util.Scanner;

public class GamblingSimulator {
	public static int profit = 0;

	public static void main(String[] args) {
		/*
		 * Taking user input from user for daily stack and bet amount.
		 */
		System.out.println("Welcome to Gambling Simulator Program!!");
		System.out.println("Enter Daily Stack");
		Scanner input = new Scanner(System.in);
		int dailyStack = input.nextInt();
		System.out.println("Enter your bet amount");
		int betAmount = input.nextInt();
		play(dailyStack, betAmount);
	}

	public static void play(int dailyStack, int betAmount) {
		Random random = new Random();
		int betReturns = random.nextInt(2);
		if (betReturns == 1) {
			profit++;

		} else {
			profit--;
		}
		System.out.println("Profit is = " + profit);

	}
}
