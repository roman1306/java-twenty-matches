import java.util.Scanner;

public class Game {
    private int matches = 20;
    private int matchesPlayer;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        OutputConsole outputConsole = new OutputConsole();
        LogicComputer logicComputer = new LogicComputer();

        while (matches > 0) {
            outputConsole.printLeftMatches(matches);
            matches = logicComputer.computerMove(matchesPlayer, matches);

            if (matches == 1) {
                break;
            }

            outputConsole.printPlayerMove();
            matchesPlayer = scanner.nextInt();
            while (matchesPlayer <= 0 || matchesPlayer > 3) {
                outputConsole.printError();
                matchesPlayer = scanner.nextInt();
            }
            matches -= matchesPlayer;

        }
        outputConsole.endGame();
    }
}
