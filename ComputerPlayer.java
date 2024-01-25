package game;

import java.util.Random;

public class ComputerPlayer extends Player {
    public int takePins(Board board) {
        int n;
        if (board.getNoPins() == 1) {
            n = 1;
        } else {
            Random rand = new Random();
            n = rand.nextInt(2) + 1;
        }

        board.takePins(n);
        return board.getNoPins();
    }
}
