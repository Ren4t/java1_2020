package homework2_1;

public class MainClass {
    public static void main(String[] args) {

        Participants[] participants = new Participants[6];

            participants[0] = new Human("Pavel",2.0,10000);
            participants[1] = new Human("Elena",3,5000);
            participants[2] = new Robot("r12",0.3,100000);
            participants[3] = new Robot();
            participants[4] = new Cat();
            participants[5] = new Cat("Murka",1.0,200);
        Let[] lets = new Let[6];
            lets[0] = new Treadmill();
            lets[1] = new Wall();
            lets[2] = new Treadmill(1000);
            lets[3] = new Wall(0.5);
            lets[4] = new Treadmill(10000);
            lets[5] = new Wall(2);

        for (int i = 0; i < lets.length; i++) {
            System.out.println(lets[i].toString());
            for (int j = 0; j < participants.length; j++) {
                if(lets[i].test(participants[j])){
                    System.out.println("");
                }else{
                    System.out.println("Выбыл");
                }
            }
            System.out.println("-----------------------------");
        }
    }
}
