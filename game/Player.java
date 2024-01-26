package game;

public abstract class Player {
    private String userId;

    public Player(String s) {
        this.userId = s;
    }

    public String getUserId() {
        return userId;
    }

    public abstract int takePins(Board board);
}
