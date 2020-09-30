package homework2_3;

public class MainClass {
    public static void main(String[] args) {

         String[] words = {"Kripysh","Zuma","Rocky","Sky","Gonschik","Rider",
                           "Marshal","Everest","Treker","Zuma","Sky","Rocky",
                           "Sky","Marshal","Treker","Rocky","Sky","Marshal"};

        new SortArraysList().printList(words);


        System.out.println("---------------------------------------------------");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("name",123);
        phoneBook.add("name",456);
        phoneBook.add("name1",12322);
        phoneBook.add("name1",45622);
        phoneBook.add("name2",1234444);
        phoneBook.add("name2",4563333);
        phoneBook.add("name2",1232211);
        phoneBook.add("name2",4562255);
        phoneBook.add("name3",123111111);
        phoneBook.add("name3",456222222);
        phoneBook.add("name3",123222233);
        phoneBook.add("name3",456223333);
        phoneBook.add("name3",123222321);
        phoneBook.add("name3",456656546);
        phoneBook.add("name3",123227876);
        phoneBook.add("name4",45);
        phoneBook.get("name");
        phoneBook.get("name1");
        phoneBook.get("name2");
        phoneBook.get("name3");
        phoneBook.get("name4");
    }
}
