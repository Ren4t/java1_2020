package homework2_1;

public class Human implements Participants {

    private String name;
    private double jumpHeight;
    private double runningDistance;
    private boolean out = false;

    public Human(String name, double jumpHeight, double runningDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runningDistance = runningDistance;
    }

    public Human() {
        this("Human noname",1.5,400);
    }


    public double getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public boolean isOut() {
        return out;
    }
    @Override
    public void setOut(boolean out) {
        this.out = out;
    }

    public double getRunningDistance() {
        return runningDistance;
    }


    @Override
    public void run() {
        System.out.println(name + " Run");
    }

    @Override
    public void jump() {
        System.out.println(name + " Jump");

    }

    @Override
    public String toString(){
        return "Participants " + name +
                " jump height " + jumpHeight +
                " running distance " + runningDistance;
    }
}
