package homework7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        if (!isSatiety()) {
            if (plate.decreaseFood(appetite)) {
                satiety = true;
            }

        } else {
            //System.out.println(name + " сытый кот");
        }
    }

    public String toString() {

        return "Кот " + name + " с аппетитом " + appetite + (satiety ? " сытый" : " голодный");
    }
}
