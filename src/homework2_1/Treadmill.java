package homework2_1;

public class Treadmill implements Let {
    private int size;

    public Treadmill(int length) {
        this.size = length;
    }

    public Treadmill() {
        this(100);
    }


    @Override
    public boolean test(Participants obj) {
        if (!obj.isOut() && obj.getRunningDistance() >= size) {
            obj.run();
            return true;
        } else {
            System.out.println(obj.toString());
            obj.setOut(true);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Treadmill " + size;
    }
}