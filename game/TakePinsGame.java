package game;

public class TakePinsGame {
    public static void main(String[] args) throws Exception {
        Board board = new Board();
        int n = 13;
        board.setUp(n);
        UserInterface.printMessage("Remaining pins: " + n);

        HumanPlayer human = new HumanPlayer("Human");
        ComputerPlayer computer = new ComputerPlayer("Computer");

        boolean isHuman = true;
        while (true) {
            Player currentPlayer = (isHuman) ? human : computer;
            
            int remainingPins = currentPlayer.takePins(board);
            if (remainingPins == 0) {
                UserInterface.printMessage(currentPlayer.getUserId() + " won!");
                break;
            }

            UserInterface.printMessage("Remaining pins: " + remainingPins);

            if (isHuman) {
                UserInterface.printMessage("Computer is choosing...");
            }

            isHuman = !isHuman;
        }
    }
}
