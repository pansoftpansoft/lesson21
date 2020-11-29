public class Pareto {
    private final int height;


    public Pareto(int height) {
        this.height = height;
    }

    public boolean jumpOverWall(Jumping jumper) {
        return jumper.jump(this.height);
    }
}
