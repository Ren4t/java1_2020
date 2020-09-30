package homework5;

public class Main {
    public static final int MAX_AGE = 40;
    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Ivan Ivanov","Директоp",
                "mail@mail1","867588",300000,45);
        personArray[1] = new Person("Petr Petrov","Архитектор",
                "yail@mail1","867588",100000,35);
        personArray[2] = new Person("Sidr Sidorov","Электрик",
                "uuil@mail1","867588",60000,41);
        personArray[3] = new Person("Djin Djinov","Водитель",
                "hil@mail1","867588",50000,32);
        personArray[4] = new Person("Van Vanov","Охраник",
                "myuil@mail1","867588",30000,46);

        //personArray[0].informationOutput();
        outputMaxAge(personArray,MAX_AGE);
    }

    private static void outputMaxAge(Person[] personArray,int max_age) {
        for (Person person : personArray) {
            if(person.getAge()>max_age){
                person.informationOutput();
                System.out.println();
            }
        }
    }
}
