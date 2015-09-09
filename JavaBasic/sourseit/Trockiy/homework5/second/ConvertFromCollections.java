package sourseit.homeworks.homework5.second;

import java.util.Collection;
import java.util.Iterator;
import sourseit.homeworks.homework5.first.*;

public class ConvertFromCollections {


    public static <T extends Collection> String[] toStrings(T o) {

        System.out.println("reconvert strings");
        String[] strings = new String[o.size()];
        Iterator itr = o.iterator();
        int i = 0;

        while (itr.hasNext()) {
            strings[i] = (String) itr.next();
            i++;
        }

        for (String string : strings) {
            System.out.print(string + ", ");
        }
        System.out.println("\n");
        return strings;
    }

    public static <T extends Collection> Car[] toCar(T o) {

        System.out.println("reconvert cars");
        Car[] cars = new Car[o.size()];
        Iterator itr = o.iterator();
        int i = 0;

        while (itr.hasNext()) {
            cars[i] = (Car) itr.next();
            i++;
        }

        for (Car car : cars) {
            System.out.print(car + ", ");
        }
        System.out.println("\n");
        return cars;
    }

    public static <T extends Collection> int[] toInt(T o) {

        System.out.println("reconvert ints");
        int[] ints = new int[o.size()];
        Iterator itr = o.iterator();
        int i = 0;

        while (itr.hasNext()) {
            ints[i] = (Integer) itr.next();
            i++;
        }

        for (int anInt : ints) {
            System.out.print(anInt + ", ");
        }
        System.out.println("\n");
        return ints;
    }

    public static <T extends Collection> long[] toLong(T o) {

        System.out.println("reconvert longs");
        long[] longs = new long[o.size()];
        Iterator itr = o.iterator();
        int i = 0;

        while (itr.hasNext()) {

            longs[i] = (long) itr.next();
            i++;
        }

        for (long aLong : longs) {
            System.out.print(aLong + ", ");
        }
        System.out.println("\n");
        return longs;
    }

    public static <T extends Collection> double[] toDouble(T o) {

        System.out.println("reconvert doubles");
        double[] doubles = new double[o.size()];
        Iterator itr = o.iterator();
        int i = 0;

        while (itr.hasNext()) {
            doubles[i] = (Double) itr.next();
            i++;
        }

        for (double aDouble : doubles) {
            System.out.print(aDouble + ", ");
        }
        System.out.println("\n");
        return doubles;
    }

    public static <T extends Collection> boolean[] toBoolean(T o) {

        System.out.println("reconvert booleans");
        boolean[] booleans = new boolean[o.size()];
        Iterator itr = o.iterator();
        int i = 0;

        while (itr.hasNext()) {
            booleans[i] = (boolean) itr.next();
            i++;
        }

        for (boolean aBoolean : booleans) {
            System.out.print(aBoolean + ", ");
        }
        System.out.println("\n");
        return booleans;
    }
}

