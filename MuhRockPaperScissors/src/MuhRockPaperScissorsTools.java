import java.util.Scanner;
import java.util.Random;

public class MuhRockPaperScissorsTools {

	private String playerName;
	private String player2Name = "CPU";
	private String gameMode;

	private String player1Roll;
	private String player2Roll;

	private int cpuAction;

	private int p1Score;
	private int p2Score;

	Random randomNumbers = new Random();

	public void setName() {
		System.out.println("MUH ROCK PAPER SCISSORS!");
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Please enter your name : ");
		playerName = myScanner.nextLine();

		System.out.println("You have entered: " + playerName);
	}
	
	public void setNameP2() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Player 2, enter your name : ");
		player2Name = myScanner.nextLine();

		System.out.println("You have entered: " + player2Name);
	}

	public void setGameMode() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter the game mode : ");
		System.out.println("Enter '1' to play a CPU");
		System.out.println("Enter '2' for 2-player mode");
		System.out.println("Anything else quits");
		System.out.print("Please enter : ");
		gameMode = myScanner.nextLine();

		switch (gameMode) {
		case "1":
			gameMode = "1";
			break;

		case "2":
			gameMode = "2";
			break;

		default:
			System.out.println("Quitting");
			System.exit(0);
			break;

		}

	}

	public String getGameMode() {
		return gameMode;
	}

	public void getVerdict() {
		if ((player1Roll.equalsIgnoreCase("rock"))
				&& player2Roll.equalsIgnoreCase("scissors")) {
			System.out.println(playerName + " Scores!");
			p1Score++;
		}

		if ((player1Roll.equalsIgnoreCase("rock"))
				&& player2Roll.equalsIgnoreCase("paper")) {
			System.out.println(player2Name + " Scores!");
			p2Score++;
		}

		if ((player1Roll.equalsIgnoreCase("rock"))
				&& player2Roll.equalsIgnoreCase("rock")) {
			System.out.println("Draw Game!");
		}

		if ((player1Roll.equalsIgnoreCase("paper"))
				&& player2Roll.equalsIgnoreCase("scissors")) {
			System.out.println(player2Name + " Scores!");
			p2Score++;
		}

		if ((player1Roll.equalsIgnoreCase("paper"))
				&& player2Roll.equalsIgnoreCase("paper")) {
			System.out.println("Draw Game!");
		}

		if ((player1Roll.equalsIgnoreCase("paper"))
				&& player2Roll.equalsIgnoreCase("rock")) {
			System.out.println(player2Name + " Scores!");
			p1Score++;
		}

		if ((player1Roll.equalsIgnoreCase("scissors"))
				&& player2Roll.equalsIgnoreCase("scissors")) {
			System.out.println("Draw Game!");
		}

		if ((player1Roll.equalsIgnoreCase("scissors"))
				&& player2Roll.equalsIgnoreCase("paper")) {
			System.out.println(playerName + " Scores!");
		}

		if ((player1Roll.equalsIgnoreCase("scissors"))
				&& player2Roll.equalsIgnoreCase("rock")) {
			System.out.println(player2Name + " Scores!");
			p2Score++;
		}
	}



	public void setP1Action() {
		System.out.println(playerName + "'s Turn!");
		Scanner myScanner = new Scanner(System.in);

		System.out.print("Please type Rock, Paper, or Scissors : ");
		player1Roll = myScanner.nextLine();

		while (!(player1Roll.equalsIgnoreCase("rock"))
				&& !(player1Roll.equalsIgnoreCase("paper"))
				&& !(player1Roll.equalsIgnoreCase("scissors"))) {
			System.out.print("Try again: ");
			player1Roll = myScanner.nextLine();
		}

		if ((player1Roll.equalsIgnoreCase("rock"))) {
			System.out.println(playerName + " CHOSE ROCKS!");
		}
		if ((player1Roll.equalsIgnoreCase("paper"))) {
			System.out.println(playerName + " CHOSE PAPER!");
		}
		if ((player1Roll.equalsIgnoreCase("scissors"))) {
			System.out.println(playerName + " CHOSE SCISSORS!");
		}
	}


	private void setP2Action() {
		System.out.println(player2Name + "'s Turn!");
		Scanner myScanner = new Scanner(System.in);

		System.out.print("Please type Rock, Paper, or Scissors : ");
		player2Roll = myScanner.nextLine();

		while (!(player2Roll.equalsIgnoreCase("rock"))
				&& !(player2Roll.equalsIgnoreCase("paper"))
				&& !(player2Roll.equalsIgnoreCase("scissors"))) {
			System.out.print("Try again: ");
			player2Roll = myScanner.nextLine();
		}

		if ((player2Roll.equalsIgnoreCase("rock"))) {
			System.out.println(player2Name + " CHOSE ROCKS!");
		}
		if ((player2Roll.equalsIgnoreCase("paper"))) {
			System.out.println(player2Name + " CHOSE PAPER!");
		}
		if ((player2Roll.equalsIgnoreCase("scissors"))) {
			System.out.println(player2Name + " CHOSE SCISSORS!");
		}
	}

	public void setCPUAction() {
		System.out.println(player2Name + "'s Turn!");

		cpuAction = randomNumbers.nextInt(3) + 1;

		switch (cpuAction) {
		case 1:
			player2Roll = "rock";
			System.out.println(player2Name + " CHOSE ROCKS!");
			break;

		case 2:
			player2Roll = "paper";
			System.out.println(player2Name + " CHOSE PAPER!");
			break;

		case 3:
			player2Roll = "scissors";
			System.out.println(player2Name + " CHOSE SCISSORS!");
			break;

		default:
			break;
		}
	}
	
	public void getVictory() {
		if (p1Score == 3) {
			System.out.println(playerName + " Wins!");
			System.out.println("\nSCORE : " + p1Score + " - " + p2Score);
		}

		if (p2Score == 3) {
			System.out.println(player2Name + " Wins!");
			System.out.println("\nSCORE : " + p1Score + " - " + p2Score);
		}
	}

	
	public void singlePlayer() {

		while (p1Score < 3 && p2Score < 3) {
			System.out.println("\nSCORE : " + p1Score + " - " + p2Score);
			setP1Action();
			setCPUAction();
			getVerdict();
		}
		getVictory();
	}

	public void multiPlayer() {
		while (p1Score < 3 && p2Score < 3) {
			System.out.println("\nSCORE : " + p1Score + " - " + p2Score);
			setP1Action();
			setP2Action();
			getVerdict();
		}
		getVictory();
	}
}