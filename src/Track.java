public class Track {
    private int maxDistance;

    public Track(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public boolean runTrack(Running runner) {
        return runner.run(this.maxDistance);
    }
}
