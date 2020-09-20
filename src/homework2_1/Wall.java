package homework2_1;

public class Wall implements Let {
    private double size;

    public Wall(double height) {
        this.size = height;
    }

    public Wall() {
        this(0.1);
    }

    @Override
    public boolean test(Participants obj) {
        if (!obj.isOut() && obj.getJumpHeight() >= size) {
            obj.jump();
            return true;
        } else {
            System.out.println(obj.toString());
            obj.setOut(true);
            return false;
        }

    }

    @Override
    public String toString() {
        return "Wall " + size;
    }

}
