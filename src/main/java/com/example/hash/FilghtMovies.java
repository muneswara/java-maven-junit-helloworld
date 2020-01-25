package com.example.hash;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.*;

import static org.junit.Assert.*;

public class FilghtMovies {

	public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

		// determine if two movies add up to the flight length

		if (movieLengths == null) {
			return false;
		}

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int len : movieLengths) {
			hm.put(len, len);
		}

		for (int len : movieLengths) {
			int exp2MovieLength = flightLength - len;
			if (exp2MovieLength <= 0) {
				continue;
			} else if (hm.containsKey(exp2MovieLength)) {
				return true;
			}

		}

		return false;
	}
	
	

	// tests

	@Test
	public void shortFlightTest() {
		final boolean result = canTwoMoviesFillFlight(new int[] { 2, 4 }, 1);
		assertFalse(result);
	}

	@Test
	public void longFlightTest() {
		final boolean result = canTwoMoviesFillFlight(new int[] { 2, 4 }, 6);
		assertTrue(result);
	}

	@Test
	public void onlyOneMovieHalfFlightLenghtTest() {
		final boolean result = canTwoMoviesFillFlight(new int[] { 3, 8 }, 6);
		assertFalse(result);
	}

	@Test
	public void twoMoviesHalfFlightLengthTest() {
		final boolean result = canTwoMoviesFillFlight(new int[] { 3, 8, 3 }, 6);
		assertTrue(result);
	}

	@Test
	public void lotsOfPossiblePairsTest() {
		final boolean result = canTwoMoviesFillFlight(new int[] { 1, 2, 3, 4, 5, 6 }, 7);
		assertTrue(result);
	}

	@Test
	public void oneMovieTest() {
		final boolean result = canTwoMoviesFillFlight(new int[] { 6 }, 6);
		assertFalse(result);
	}

	@Test
	public void noMoviesTest() {
		final boolean result = canTwoMoviesFillFlight(new int[] {}, 6);
		assertFalse(result);
	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(FilghtMovies.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("All tests passed.");
		}
	}
	
	/*public static void main(String args[]) {
		int[] moviesLength = {3,6};
		canTwoMoviesFillFlight(moviesLength,8);
	}*/
}
