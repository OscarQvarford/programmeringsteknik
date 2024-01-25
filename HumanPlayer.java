package game;

public class HumanPlayer extends Player {
    public int takePins(Board board) {
        int n = UserInterface.askForInt("Select how many pins to take. 1 or 2.");

        if ((n != 1 && n != 2) || (board.getNoPins() == 1 && n == 2)) {
            return takePins(board);
        }

        board.takePins(n);
        return board.getNoPins();
    }
}
