package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAula {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("André");
        listaNomes.add("Camila");
        listaNomes.add("Silas");
        listaNomes.add("Arthur");
        listaNomes.add("Gabriel");
        listaNomes.add("Felipe");
        listaNomes.add("Michael");
        listaNomes.add("Michael");
        listaNomes.add("Michael");
        listaNomes.add("Michael");
        listaNomes.add("Michael");
        listaNomes.forEach(l -> System.out.println(l));


        System.out.println("listaNomes:"+listaNomes);
        System.out.println("Tamanho listaNomes:"+listaNomes.size());

        listaNomes.remove(0);
        //Camila, Silas, Arthur, Gabriel, Felipe, Michael, Michael, Michael, Michael, Michael
        listaNomes.remove(4);
//        Camila, Silas, Arthur, Gabriel, Michael, Michael, Michael, Michael, Michael]
        listaNomes.remove(4);
//        Camila, Silas, Arthur, Gabriel, Michael, Michael, Michael, Michael]

        listaNomes.remove(listaNomes.size()-1);
//        Camila, Silas, Arthur, Gabriel, Michael, Michael, Michael

        listaNomes.add(0,"Nunes");
        System.out.println("listaNomes:"+listaNomes);
        System.out.println("Tamanho listaNomes:"+listaNomes.size());


        LinkedList<String> collection = new LinkedList<>();
        collection.add("");
        collection.add("");
        collection.get(0);
        collection.addFirst();
    }
}
