package com.gamblingsimulator;

import java.util.Random;

public class GamblingSimulator {
	public static final int STAKE_PER_DAY = 100;// STAKE PER DAY
	public static final int BET_PER_GAME = 1;
	public static final int WIN = 1;
	public static int dailyStake = STAKE_PER_DAY;
	public static int dailyProfit = 0;
	public static int profit = 0;/// initial gambler bets with 1

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation");
		dailyPlays();
	}

	public static void play() {
		Random random = new Random();
		int betReturns = random.nextInt(2);
		if (betReturns == WIN) {
			profit += BET_PER_GAME;
			dailyStake += BET_PER_GAME;
			dailyProfit += BET_PER_GAME;// incrementing
		} else {
			profit -= BET_PER_GAME;// decrementing
			dailyStake -= BET_PER_GAME;
			dailyProfit -= BET_PER_GAME;
		}
		System.out.println("profit and ramaining stake = " + profit + "   " + dailyStake);

	}

	public static void dailyPlays() {
		while (dailyStake > 50 && dailyStake < 150) {
			play();
		}
		System.out.println(dailyProfit);
	}

}