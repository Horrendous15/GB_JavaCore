package lesson1;

public class Player {
    private String name;
    private int jumpMax;
    private int runMax;

    public Player(String name, int jumpMax, int runMax) {
        this.name = name;
        this.jumpMax = jumpMax;
        this.runMax = runMax;
    }

    public String getName() {
        return name;
    }

    public int getJumpMax() {
        return jumpMax;
    }

    public int getRunMax() {
        return runMax;
    }
}
