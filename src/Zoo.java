public class Zoo {
    public static void main(String[] args) {
        boolean finish;

        Object[] player;
        player = new Object[3];
        player[0] = new Robot(100, 1);
        player[1] = new Cat(51, 2);
        player[2] = new Human(250, 3);

        Object[] barrier;
        barrier = new Object[4];
        barrier[0] = new Track(50);
        barrier[1] = new Parete(1);
        barrier[2] = new Track(100);
        barrier[3] = new Parete(2);

        for (Object p : player) {
            finish = true;
            System.out.println("На дистанцию выходит " + p.toString());
            for (Object b : barrier) {
                if (b instanceof Track) {
                    if (!((Track) b).runTrack((Running) p)) {
                        finish = false;
                        break;
                    }
                }
                if (b instanceof Parete) {
                    if (!((Parete) b).jumpOverWall((Jumping) p)) {
                        finish = false;
                        break;
                    }
                }
            }
            if (finish) {
                System.out.println(p.toString() + " удачно финишировал!");
            } else {
                System.out.println(p.toString() + " сошел с полосы препятствий!");
            }
            System.out.println("");
        }
    }
}
