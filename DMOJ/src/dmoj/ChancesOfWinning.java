package dmoj;
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class ChancesOfWinning {



	public static int getSum(int[][]results, int favTeam) 
	{
		int scoreUno = 0;
		int scoreDos = 0;
		int scoreTres = 0;
		int scoreCuatro = 0;
		int scoreCount = 0;
		int win = 0;

		for (int i = 0; i < 4; i++) 
		{
			for (int y = 0; y < 4; y++) 
			{
				if (results[i][y] == 9) 
				{
					scoreCount -= 9;
				}
				scoreCount += results[i][y];
			}

			if (i == 0) scoreUno = scoreCount;
			else if (i == 1) scoreDos = scoreCount;
			else if (i == 2) scoreTres = scoreCount;
			else scoreCuatro = scoreCount;
			scoreCount = 0;
		}

		if (favTeam == 1) 
		{
			if (scoreUno > scoreDos && scoreUno > scoreTres && scoreUno > scoreCuatro) win = 1;
		}
		else if (favTeam == 2) 
		{
			if (scoreDos > scoreUno && scoreDos > scoreTres && scoreDos > scoreCuatro) win = 1;
		}
		else if (favTeam == 3) 
		{
			if (scoreTres > scoreDos && scoreTres > scoreUno && scoreTres > scoreCuatro) win = 1;
		}
		else
		{
			if (scoreCuatro > scoreDos && scoreCuatro > scoreTres && scoreCuatro > scoreUno) win = 1;
		}
		return win;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		int favTeam = sc.nextInt();
		int numGames = sc.nextInt();
		int score1;
		int score2;
		int team1;
		int team2;
		int teamWin = 0;
		int[][] results = new int[4][4];
		List<Integer> unknownGameX = new ArrayList<Integer>();
		List<Integer> unknownGameY = new ArrayList<Integer>();
		//sc.nextLine();
		//sc.nextLine();
		for (int i = 0; i < 4; i++) 
		{
			for (int y = 0; y < 4; y++) 
			{
				results[i][y] = 9;
			}
		}


		for (int i = 0 ; i < numGames; i++) 
		{
			team1 = Integer.parseInt(sc.next());
			//System.out.println(team1);
			team2 = Integer.parseInt(sc.next());
			//System.out.println(team2);
			score1 = Integer.parseInt(sc.next());
			//System.out.println(score1);
			score2 = Integer.parseInt(sc.next());
			//System.out.println(score2);
			if (score1 > score2) 
			{
				results[team1 - 1][team2 - 1] = 3;
				results[team2 - 1][team1 - 1] = 0;
			}
			else if (score2 > score1) 
			{
				results[team2-1][team1-1] = 3;
				results[team1-1][team2-1] = 0;
			}
			else 
			{
				results[(team2-1)][(team1-1)] = 1;
				results[team1-1][team2-1] = 1;
			}
		}

		for (int i = 0; i < 4; i++) 
		{
			for (int y = 0; y < 4; y++) 
			{
				if (results[i][y] == 9 && y != i) 
				{
					unknownGameX.add(i);
					unknownGameY.add(y);
					results[y][i] = 0;
				}
			}
		}


		/*
		for (int y = 0; y < 6 - numGames; y++) 
		{
			results[unknownGameX.get(y)][unknownGameY.get(y)] = 1;
			results[unknownGameY.get(y)][unknownGameX.get(y)] = 1;
			teamWin += getSum(results,favTeam);
		}
		for (int y = 0; y < 6 - numGames; y++) 
		{
			results[unknownGameX.get(y)][unknownGameY.get(y)] = 3;
			results[unknownGameY.get(y)][unknownGameX.get(y)] = 0;
			teamWin += getSum(results,favTeam);
		}
		for (int y = 0; y < 6 - numGames; y++) 
		{
			results[unknownGameX.get(y)][unknownGameY.get(y)] = 0;
			results[unknownGameY.get(y)][unknownGameX.get(y)] = 3;
			teamWin += getSum(results,favTeam);
		}
		AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		*/ 

		System.out.println(teamWin);


		/*		      L O S E
		 * 		  	  0 1 2 3
		 * 
		 *			  1 2 3 4
		 * 	W	0	1 x
		 * 	I	1	2   x
		 * 	N	2	3	  x
		 * 		3	4       x
		 */


	}

}
