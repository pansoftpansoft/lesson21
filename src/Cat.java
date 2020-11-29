public class Cat implements Running, Jumping {
    private final int maxDistance;
    private final int heightJump;

    public Cat(int maxDistance, int height) {
        this.maxDistance = maxDistance;
        this.heightJump = height;
    }

    @Override
    public boolean run(int distance) {
        if (maxDistance > distance) {
            System.out.println("Кошка пробежала дистанцию длинной - " + distance);
            return true;
        } else {
            System.out.println("Кошка не пробежала дистанцию длинной - " + distance);
            return false;
        }

    }

    @Override
    public boolean jump(int height) {
        if (heightJump > height) {
            System.out.println("Кошка перепрыгнула через стену высотой - " + height);
            return true;
        } else {
            System.out.println("Кошка не перепрыгнула через стену высотой - " + height);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Кошка";
    }
}
