package homework2_3;


import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {

    private static HashMap<String, ArrayList<Integer>> phonebook = new HashMap<>();

    void add(String name, int number) {
        ArrayList<Integer> numb;
        if ((phonebook.get(name)) != null) {
            numb = phonebook.get(name);
            numb.add(number);
            phonebook.put(name, numb);
        }else {
            numb = new ArrayList<>();
            numb.add(number);
            phonebook.put(name,numb);
        }



    }
    void get(String name){
        ArrayList<Integer> numb;
        if (phonebook.get(name)!= null) {
            numb = phonebook.get(name);
            System.out.println(name);
            for (Integer integer : numb) {
                System.out.println(integer);
            }
        }
    }
}
