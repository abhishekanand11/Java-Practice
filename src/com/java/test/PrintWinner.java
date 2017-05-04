package com.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author abhishek anand
 * 
 * Given a list of string containing the name of the candidate for whom that vote is, find out who got the maximum vote. In case its a tie
 * the winner is the one whose name comes earlier lexicographically.
 *
 */
public class PrintWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "a", "a", "a", "a", "b", "b", "b", "b", "c", "c", "c", "c" };
		electionWinner(arr);

	}

	static String electionWinner(String[] votes) {
		String winner = "";
		Map<String, Integer> voteCount = new HashMap<String, Integer>();
		for (int i = 0; i < votes.length; i++) {
			if (voteCount.get(votes[i]) != null) {
				voteCount.put(votes[i], voteCount.get(votes[i]) + 1);
			} else {
				voteCount.put(votes[i], 1);
			}
		}

		int maxVote = 0;
		String maxName = "";
		Iterator it = voteCount.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			if ((int) pair.getValue() > maxVote) {
				maxVote = (int) pair.getValue();
				maxName = (String) pair.getKey();
			} else if ((int) pair.getValue() == maxVote) {
				if (maxName.compareTo((String) pair.getKey()) > 0) {
					maxName = (String) pair.getKey();
				}

			}
			it.remove(); // avoids a ConcurrentModificationException
		}
		System.out.println(maxName.toUpperCase() + " won with vote count of : " + maxVote);
		return winner;
	}

}
