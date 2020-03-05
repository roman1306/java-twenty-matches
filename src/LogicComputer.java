public class LogicComputer {

    public int computerMove(int matchesPlayer, int leftMatches) {
        OutputConsole outputConsole = new OutputConsole();
        int matchesComputer;

        if (matchesPlayer == 0) {
            matchesComputer = 3;
        } else {
            matchesComputer = 4 - matchesPlayer;
        }

        leftMatches -= matchesComputer;
        outputConsole.printComputerMove(matchesComputer);
        outputConsole.printLeftMatches(leftMatches);

        return leftMatches;
    }
}
