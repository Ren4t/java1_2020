package homework6;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("кот Васька",200,0,2);
        Animal dog1 = new Dog("собака Рой",500,200,1);

        cat1.run(300);
        cat1.run( 100);
        cat1.swim( 100);
        cat1.jump(1);
        cat1.jump(3);
        dog1.run(400);
        dog1.run(600);
        dog1.swim(200);
        dog1.swim(300);
        dog1.jump(1);
        dog1.jump(3);
    }
}
