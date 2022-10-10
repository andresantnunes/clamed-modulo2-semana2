import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAula {
    public static void main(String[] args) {
//        Queue<String> priorityQueue = new PriorityQueue<>();
//
//        priorityQueue.add("b"); // primeiro
//        priorityQueue.add("c"); // segundo
//        priorityQueue.add("a"); // terceiro
//        // b, c, a --> é a ordem de armazenamento
//        // a, b, c --> é a ordem de leitura
//        String first = priorityQueue.poll(); // a | b, c
//        String second = priorityQueue.poll();// b | c
//        String third = priorityQueue.poll(); // c | (vazia)
//
//        System.out.println("first:" + first);
//        System.out.println("second:" + second);
//        System.out.println("third:" + third);
//
        Queue<String> priorityQueue = new LinkedList<>(List.of("x", "y", "z"));

        System.out.println(priorityQueue);

        priorityQueue.add("b"); // primeiro, item adicionado na lista
        priorityQueue.add("c"); // segundo, item adicionado ao fim lista
        priorityQueue.add("a"); // terceiro, item adicionado ao fim lista
        // b, c, a --> é a ordem de armazenamento
        // b, c, a --> é a ordem de leitura
        System.out.println(priorityQueue);


        String first = priorityQueue.poll(); // b | c, a
        String second = priorityQueue.poll();// c | c
        String third = priorityQueue.poll(); // a | (vazia)

        System.out.println("first:" + first);
        System.out.println("second:" + second);
        System.out.println("third:" + third);
        System.out.println(priorityQueue);

    }
}
