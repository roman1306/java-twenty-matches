public class OutputConsole {

    public void printLeftMatches(int matches) {
        System.out.println("На столе осталось " + matches + " спичек.");
    }

    public void printPlayerMove() {
        System.out.print("Ход игрока. Введите количество убираемых спичек: ");
    }

    public void printComputerMove(int matchesComputer) {
        System.out.println("Ход компьютера. Количество убраных спичек: " + matchesComputer);
    }

    public void printError() {
        System.out.print("Введено не коректное значение! Повторите ввод: ");
    }

    public void endGame() {
        System.out.println("Вы проиграли! На столе осталась последняя спичка.");
    }
}
