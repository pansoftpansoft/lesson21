public class Human implements Running, Jumping {
    private final int maxDistance;
    private final int heightJump;

    public Human(int maxDistance, int height) {
        this.maxDistance = maxDistance;
        this.heightJump = height;
    }

    @Override
    public boolean run(int distance) {
        if (maxDistance > distance) {
            System.out.println("Человек пробежал дистанцию длинной - " + distance);
            return true;
        } else {
            System.out.println("Человек не пробежал дистанцию длинной - " + distance);
            return false;
        }

    }

    @Override
    public boolean jump(int height) {
        if (heightJump > height) {
            System.out.println("Человек перепрыгнул через стену высотой - " + height);
            return true;
        } else {
            System.out.println("Человек не перепрыгнул через стену высотой - " + height);
            return false;
        }
    }
    @Override
    public String toString(){
        return "Человек";
    }
}
