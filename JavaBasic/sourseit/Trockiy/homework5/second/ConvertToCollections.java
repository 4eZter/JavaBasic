package sourseit.homeworks.homework5.second;

import java.util.*;

public class ConvertToCollections {

    static <T> List <T> ConvToArrayList (T[] elements) {

        System.out.println("ArrayList");
        List<T> list = new ArrayList<>();

        for (T i : elements) {
            list.add(i);
        }
        //check
        for (int i = 0; i < elements.length; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("\n");

        //call reconvert

        return list;
    }

    static <T> List <T> ConvToLinkedList(T[] elements) {

        System.out.println("LinkedList");
        List<T> list = new LinkedList<>();

        for (T i : elements) {
            list.add(i);
        }
        //check
        for (int i = 0; i < elements.length; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("\n");

        //call reconvert

        return list;
    }

    static <T> Set <T> ConvToHashSet (T[] elements) {

        System.out.println("HashSet");
        Set<T> set = new HashSet<>();

        for (T i : elements) {
            set.add(i);
        }
        //check
        for (Iterator iter = set.iterator(); iter.hasNext();) {
            System.out.print(iter.next() + ", ");
        }
        System.out.println("\n");

        //call reconvert

        return set;
    }

    static <T> Set <T> ConvToLinkedHashSet (T[] elements) {

        System.out.println("LinkedHashSet");
        Set<T> set = new LinkedHashSet<>();

        for (T i : elements) {
            set.add(i);
        }
        //check
        for (Iterator iter = set.iterator(); iter.hasNext();) {
            System.out.print(iter.next() + ", ");
        }
        System.out.println("\n");

        //call reconvert

        return set;
    }

    static <T> Queue <T> ConvToPriorityQueue (T[] elements) {

        System.out.println("Queue");
        Queue<T> queue = new PriorityQueue<>();

        for (T i : elements) {
            queue.add(i);
        }
//        check
        for (Iterator iter = queue.iterator(); iter.hasNext();) {
            System.out.print(iter.next() + ", ");
        }
        System.out.println("\n");

        //call reconvert

        return queue;
    }

    static <T> Deque <T> ConvToDeque (T[] elements) {

        System.out.println("Deque");
        Deque<T> deq = new ArrayDeque<>();

        for (T i : elements) {
            deq.add(i);
        }
        //check
        for (Iterator iter = deq.iterator(); iter.hasNext();) {
            System.out.print(iter.next() + ", ");
        }
        System.out.println("\n");

        //call reconvert

        return deq;
    }
}

