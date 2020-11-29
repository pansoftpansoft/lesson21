public class Parete {
    private int height;


    public Parete(int height) {
        this.height = height;
    }

    public boolean jumpOverWall(Jumping jamper) {
        return jamper.jump(this.height);
    }
}
