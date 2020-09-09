package homework7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Tom" + (1 + i),15 + i);
        }
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
        plate.info();

        plate.addFood(100);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }

        plate.info();

    }
}
