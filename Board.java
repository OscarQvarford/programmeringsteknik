package game;

public class Board {
    private static int noPins;

    public void setUp(int n) {
        noPins = n;
    }

    public void takePins(int n) {
        noPins -= n;
    }

    public int getNoPins() {
        return noPins;
    }
}
