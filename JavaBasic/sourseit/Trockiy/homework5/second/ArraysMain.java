package sourseit.homeworks.homework5.second;

import sourseit.homeworks.homework5.WrapToObject;
import sourseit.homeworks.homework5.first.*;

import static sourseit.homeworks.homework5.second.ConvertToCollections.*;

public class ArraysMain {

    public static void main(String[] args) {

        // create'n'fill arrays
        int[] arrayOfInt = {1, 4, 5, 6};
        long[] arrayOfLong = {123456L, 59998877766L, 655566644433322L, 9789678567456L};
        double[] arrayOfDouble = {2.0, 1.0, 3.0, 4.0};
        boolean[] arrayOfBoolean = {false, true, false, true};
        String[] arrayOfString = {"one", "two", "three", "four"};
        Car[]cars = {new Car("Honda", 1989), new Car("RangeRover", 2001), new Car("Mercedes", 1960)};

        //convert primitives to Objects
        WrapToObject wrap = new WrapToObject();

        Integer[] integers = wrap.IntWrap(arrayOfInt);
        Double[] doubles = wrap.DoubleWrap(arrayOfDouble);
        Boolean[] booleans = wrap.BooleanWrap(arrayOfBoolean);
        Long[] longs = wrap.LongWrap(arrayOfLong);

        //Car[] to collections and back
        System.out.println("Convert cars" + "\n");
        ConvertFromCollections.toCar(ConvToArrayList(cars));
        ConvertFromCollections.toCar(ConvToLinkedList(cars));
        ConvertFromCollections.toCar(ConvToHashSet(cars));
        ConvertFromCollections.toCar(ConvToLinkedHashSet(cars));
        ConvertFromCollections.toCar(ConvToPriorityQueue(cars));
        ConvertFromCollections.toCar(ConvToDeque(cars));

        System.out.println("\n");

        //String[] to collections and back
        System.out.println("convert Strings" + "\n");
        ConvertFromCollections.toStrings(ConvToArrayList(arrayOfString));
        ConvertFromCollections.toStrings(ConvToLinkedList(arrayOfString));
        ConvertFromCollections.toStrings(ConvToHashSet(arrayOfString));
        ConvertFromCollections.toStrings(ConvToLinkedHashSet(arrayOfString));
        ConvertFromCollections.toStrings(ConvToPriorityQueue(arrayOfString));
        ConvertFromCollections.toStrings(ConvToDeque(arrayOfString));

        System.out.println("\n");

        //Integer[] to collections and back
        System.out.println("convert ints" + "\n");
        ConvertFromCollections.toInt(ConvToArrayList(integers));
        ConvertFromCollections.toInt(ConvToLinkedList(integers));
        ConvertFromCollections.toInt(ConvToHashSet(integers));
        ConvertFromCollections.toInt(ConvToLinkedHashSet(integers));
        ConvertFromCollections.toInt(ConvToPriorityQueue(integers));
        ConvertFromCollections.toInt(ConvToDeque(integers));

        System.out.println("\n");

        //Double[] to collections and back
        System.out.println("convert doubles" + "\n");
        ConvertFromCollections.toDouble(ConvToArrayList(doubles));
        ConvertFromCollections.toDouble(ConvToLinkedList(doubles));
        ConvertFromCollections.toDouble(ConvToHashSet(doubles));
        ConvertFromCollections.toDouble(ConvToLinkedHashSet(doubles));
        ConvertFromCollections.toDouble(ConvToPriorityQueue(doubles));
        ConvertFromCollections.toDouble(ConvToDeque(doubles));

        System.out.println("\n");

        //Boolean[] to collections and back
        System.out.println("convert booleans" + "\n");
        ConvertFromCollections.toBoolean(ConvToArrayList(booleans));
        ConvertFromCollections.toBoolean(ConvToLinkedList(booleans));
        ConvertFromCollections.toBoolean(ConvToHashSet(booleans));
        ConvertFromCollections.toBoolean(ConvToLinkedHashSet(booleans));
        ConvertFromCollections.toBoolean(ConvToPriorityQueue(booleans));
        ConvertFromCollections.toBoolean(ConvToDeque(booleans));

        System.out.println("\n");

        //Long[] to collections and back
        System.out.println("convert longs" + "\n");
        ConvertFromCollections.toLong(ConvToArrayList(longs));
        ConvertFromCollections.toLong(ConvToLinkedList(longs));
        ConvertFromCollections.toLong(ConvToHashSet(longs));
        ConvertFromCollections.toLong(ConvToLinkedHashSet(longs));
        ConvertFromCollections.toLong(ConvToPriorityQueue(longs));
        ConvertFromCollections.toLong(ConvToDeque(longs));
    }
}

