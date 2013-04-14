public class MuhRockPaperScissors {

	public static void main(String[] args) {
		MuhRockPaperScissorsTools obj1 = new MuhRockPaperScissorsTools();

		obj1.setName();
		obj1.setGameMode();

		switch (obj1.getGameMode()) {
		case "1":
			obj1.singlePlayer();
			break;

		case "2":
			obj1.setNameP2();
			obj1.multiPlayer();
			break;

		default:
			break;
		}
	}
}