package com.gamblingsimulator;

import java.util.Scanner;

public class GamblingSimulator {

	public static void main(String[] args) {
		/*
		 * Taking user input from user for daily stack and bet amount.
		 */
		System.out.println("Welcome to Gambling Simulator Program!!");
		System.out.println("Enter Daily Stack");
		Scanner input = new Scanner(System.in);
		int dailyStack = input.nextInt();
		System.out.println("Enter the y- coordinate");
		int betAmount = input.nextInt();

	}
}
