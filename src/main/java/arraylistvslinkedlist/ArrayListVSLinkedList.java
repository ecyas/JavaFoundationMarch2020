package arraylistvslinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i <5_000_000 ; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("Добавление в середину списка:");
        System.out.println();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            arrayList.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы ArrayList по вставке в середину списка (в миллисекундах) = "
        + (System.currentTimeMillis() - start) + "ms");

        System.out.println("---------------------------------------------------");

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            linkedList.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы LinkedList по вставке в середину списка (в миллисекундах) = "
                + (System.currentTimeMillis() - start1) + "ms");
        System.out.println("//==================================================================================================//");
//        arrayList.clear();
//        linkedList.clear();
//        for (int i = 0; i <5_000_000 ; i++) {
//            arrayList.add(i);
//            linkedList.add(i);
//        }

        //==================================================================================================//

        System.out.println("Добавление в начало списка:");
        System.out.println();

        long start3 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            arrayList.add(0, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы ArrayList по вставке в начало списка (в миллисекундах) = "
                + (System.currentTimeMillis() - start3) + "ms");

        System.out.println("---------------------------------------------------");

        long start4 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            linkedList.add(0, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы LinkedList по вставке в середину списка (в миллисекундах) = "
                + (System.currentTimeMillis() - start4) + "ms");
        System.out.println("//==================================================================================================//");

        //==================================================================================================//

        System.out.println("Добавление в конец списка:");
        System.out.println();

        long start5 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            arrayList.add(new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы ArrayList по вставке в конец списка (в миллисекундах) = "
                + (System.currentTimeMillis() - start5) + "ms");

        System.out.println("---------------------------------------------------");

        long start6 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            linkedList.add(new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы LinkedList по вставке в конец списка (в миллисекундах) = "
                + (System.currentTimeMillis() - start6) + "ms");
        System.out.println("//==================================================================================================//");

        //==================================================================================================//
    }
}
