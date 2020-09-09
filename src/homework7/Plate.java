package homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n){
        if (food-n > 0) {
            food -= n;
            return true;
        } else {
            //System.out.println("В тарелке не достаточно еды");
            return false;
        }
    }

    public void addFood(int food){
        this.food += food;
    }
}
