package game;

public class TakePinsGame {
    public static void main(String[] args) throws Exception {
        Board board = new Board();
        int n = 13;
        board.setUp(n);
        UserInterface.printMessage("Remaining pins: " + n);

        HumanPlayer human = new HumanPlayer();
        ComputerPlayer computer = new ComputerPlayer();
    
        while (true) {
            int remainingPinsHuman = human.takePins(board);
            if (remainingPinsHuman == 0) {
                UserInterface.printMessage("Human won!");
                break;
            }

            UserInterface.printMessage("Remaining pins: " + remainingPinsHuman);
            
            UserInterface.printMessage("Computer is choosing...");
            Thread.sleep(1000);

            int remainingPinsComputer = computer.takePins(board);
            if (remainingPinsComputer == 0) {
                UserInterface.printMessage("Computer won!");
                break;
            }

            UserInterface.printMessage("Remaining pins: " + remainingPinsComputer);
        }
    }
}
