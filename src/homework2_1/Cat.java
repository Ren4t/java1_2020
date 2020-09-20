package homework2_1;

public class Cat implements Participants{

    private String name;
    private double jumpHeight;
    private double runningDistance;
    private boolean out = false;

    public Cat(String name, double jumpHeight, double runningDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runningDistance = runningDistance;
    }

    public Cat() {
        this("Cat noname",1.0,100);
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public double getRunningDistance() {
        return runningDistance;
    }

    public boolean isOut() {
        return out;
    }

    @Override
    public void setOut(boolean out) {
        this.out = out;
    }


    @Override
    public void run(){
        System.out.println(name + " Run");
    }
    @Override
    public void jump(){
        System.out.println(name + " Jump");
    }

    @Override
    public String toString(){
        return "Participants " + name +
                " jump height " + jumpHeight +
                " running distance " + runningDistance;
    }
}
