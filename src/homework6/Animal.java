package homework6;

public abstract class Animal {

    protected String name;
    protected int maxLengthRun;
    protected int maxLengthSwim;
    protected int maxHeightJump;

    public Animal(String name, int maxLengthRun, int maxLengthSwim, int maxHeightJump) {
        this.name = name;
        this.maxLengthRun = maxLengthRun;
        this.maxLengthSwim = maxLengthSwim;
        this.maxHeightJump = maxHeightJump;
    }

    public void run(int lengthRun){
        if (lengthRun <= this.maxLengthRun) {
            System.out.println(this.name + " пробежал " + lengthRun + "м");
        }else {
            System.out.println(this.name + " не пробежал " + lengthRun + "м");
        }
    }

    public void swim(int lengthSwim){
        if (lengthSwim <= this.maxLengthSwim) {
            System.out.println(this.name + " проплыл " + lengthSwim + "м");
        } else {
            System.out.println(this.name + " не проплыл " + lengthSwim + "м");
        }
    }

    public void jump(int heightJump){
        if (heightJump <= this.maxHeightJump ) {
            System.out.println(this.name + " прыгнул на высоту " + heightJump + "м");
        } else {
            System.out.println(this.name + " не прыгнул " + heightJump + "м");
        }
    }
}
