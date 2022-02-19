package com.gamblingsimulator;

import java.util.Random;
import java.util.Scanner;

public class GamblingSimulator {
	public static final int BET_PER_GAME = 1;
	public static final int WIN = 1;
	public static int dailyStake;

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation");
		twentyDaysPlays();
	}

	/*
	 * method for a single play to change daily stake
	 */
	public static void play() {
		Random random = new Random();
		int betReturns = random.nextInt(2);
		if (betReturns == WIN) {
			dailyStake += BET_PER_GAME;
		} else {
			dailyStake -= BET_PER_GAME;
		}

	}
/*
 * method for daily play, until user wins or lose 50 by calling play method 
 */
	public static void dailyPlays() {

		while (dailyStake > 50 && dailyStake < 150) {
			play();
		}

	}
/*
 *method for twenty day play and calculation of total profit or loss 
 */
	public static void twentyDaysPlays() {
		int dailyProfit = 0;
		int totalProfit = 0;
		System.out.println("Enter daily stake");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		for (int days = 1; days <= 20; days++) {
			dailyStake = num;
			dailyPlays();
			dailyProfit = dailyStake - 100;
			totalProfit += dailyProfit;
			System.out.println("Profit for day " + days + " is: " + dailyProfit + " and total profit till date is: "
					+ totalProfit);

		}

		System.out.println("Total profit of last 20 days: " + totalProfit);
	}
}