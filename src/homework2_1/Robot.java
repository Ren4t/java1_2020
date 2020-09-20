package homework2_1;

public class Robot implements Participants{

    private String name;
    private double jumpHeight;
    private double runningDistance;
    private boolean out = false;



    public Robot(String name, double jumpHeight, double runningDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runningDistance = runningDistance;
    }
    public Robot() {
        this("Robot noname",0.5, 1000);
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
