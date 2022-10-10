import com.sun.source.tree.Tree;

import java.util.*;

public class SetAula {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("d3");
        list.add("d2");
        list.add("d1");
        list.forEach(itemList -> System.out.println(itemList));
//        System.out.println(list.contains("c"));
        System.out.println("=============================================");

        Set<String> hashSet = new HashSet<>(list);
        hashSet.forEach(itemSet -> System.out.println(itemSet));

        TreeSet<String> treeSet= new TreeSet<>();
        Set<String> hSet = treeSet;

        for(String itemSet: hashSet){
            if(itemSet.startsWith("a")){
                treeSet.add("a");
            }
        }
        hashSet.remove("c");

        ArrayList arrayList = new ArrayList<>(hashSet);

    }
}
