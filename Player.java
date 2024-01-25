package game;

abstract public class Player {
    private static String userId;

    public void player(String s) {
        userId = s;
    }

    public static String getUserId() {
        return userId;
    }
}
