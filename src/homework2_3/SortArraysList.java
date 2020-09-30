package homework2_3;

import java.util.ArrayList;
import java.util.List;

public class SortArraysList {
//    private static String[] words = {"Kripysh","Zuma","Rocky","Sky","Gonschik","Rider",
//            "Marshal","Everest","Treker","Zuma","Sky","Rocky","Sky",
//            "Marshal","Treker","Rocky","Sky"};

    private static List<String> list=  new ArrayList<>();

    public void printList(String[] words){
        int count=0;
        for (String word : words) {
            count = 0;
            for (String l : list) {
                if(word.equals(l)){
                    count++;
                }
            }
            if(count == 0){
                list.add(word);
            }
        }
        System.out.println(list.toString());
        System.out.println();
        for (String l : list) {
            count = 0;
            for (String word : words) {
                if(l.equals(word)){
                    count++;
                }
            }
            System.out.println(l + " встречается " + count + " раз");
        }


    }
}
