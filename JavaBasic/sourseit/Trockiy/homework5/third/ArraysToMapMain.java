package sourseit.homeworks.homework5.third;

import sourseit.homeworks.homework5.WrapToObject;
import sourseit.homeworks.homework5.first.Car;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import static sourseit.homeworks.homework5.third.ConvertToMap.*;

public class ArraysToMapMain {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        // sample arrays
        int[] arrayOfInt = {1, 2, 3, 4};
        long[] arrayOfLong = {111111L, 222222L, 333333L, 444444L};
        double[] arrayOfDouble = {1.1, 2.2, 3.3, 4.4};
        boolean[] arrayOfBoolean = {false, true, false, true};
        String[] arrayOfString = {"one", "two", "three", "four"};
        Car[]cars = {new Car("Honda", 1989), new Car("RangeRover", 2001), new Car("Mercedes", 1960)};

        //converter-wrapper
        WrapToObject wrap = new WrapToObject();

        Integer[] integers = wrap.IntWrap(arrayOfInt);
        Double[] doubles = wrap.DoubleWrap(arrayOfDouble);
        Boolean[] booleans = wrap.BooleanWrap(arrayOfBoolean);
        Long[] longs = wrap.LongWrap(arrayOfLong);

        // convert all charming arrays to all charming maps

        //{int, String}
        HashMap hashMap1 = convArrToMap(integers, arrayOfString, HashMap.class, Integer.class, String.class);
        TreeMap treeMap1 = convArrToMap(integers, arrayOfString, TreeMap.class, Integer.class, String.class);
        LinkedHashMap linkedHashMap1 = convArrToMap(integers, arrayOfString, LinkedHashMap.class, Integer.class, String.class);
        // back
        ConvertFromMap.convMapToArr(hashMap1, Integer.class, String.class);
        ConvertFromMap.convMapToArr(treeMap1, Integer.class, String.class);
        ConvertFromMap.convMapToArr(linkedHashMap1, Integer.class, String.class);

        //{String, String}
        HashMap hashMap2 = convArrToMap(arrayOfString, arrayOfString, HashMap.class, String.class, String.class);
        TreeMap treeMap2 = convArrToMap(arrayOfString, arrayOfString, TreeMap.class, String.class, String.class);
        LinkedHashMap linkedHashMap2 = convArrToMap(arrayOfString, arrayOfString, LinkedHashMap.class, String.class, String.class);
        // back
        ConvertFromMap.convMapToArr(hashMap2, String.class, String.class);
        ConvertFromMap.convMapToArr(treeMap2, String.class, String.class);
        ConvertFromMap.convMapToArr(linkedHashMap2, String.class, String.class);

        //{int, long}
        HashMap hashMap3 = convArrToMap(integers, longs, HashMap.class, Integer.class, Long.class);
        TreeMap treeMap3 = convArrToMap(integers, longs, TreeMap.class, Integer.class, Long.class);
        LinkedHashMap linkedHashMap3 = convArrToMap(integers, longs, LinkedHashMap.class, Integer.class, Long.class);
        //back
        ConvertFromMap.convMapToArr(hashMap3, String.class, Long.class);
        ConvertFromMap.convMapToArr(treeMap3, String.class, Long.class);
        ConvertFromMap.convMapToArr(linkedHashMap3, String.class, Long.class);

        //{String, boolean}
        HashMap hashMap4 = convArrToMap(arrayOfString, booleans, HashMap.class, String.class, Boolean.class);
        TreeMap treeMap4 = convArrToMap(arrayOfString, booleans, TreeMap.class, String.class, Boolean.class);
        LinkedHashMap linkedHashMap4 = convArrToMap(arrayOfString, booleans, LinkedHashMap.class, String.class, Boolean.class);

        ConvertFromMap.convMapToArr(hashMap4, String.class, Boolean.class);
        ConvertFromMap.convMapToArr(treeMap4, String.class, Boolean.class);
        ConvertFromMap.convMapToArr(linkedHashMap4, String.class, Boolean.class);

        //{String, double}
        HashMap hashMap5 = convArrToMap(arrayOfString, doubles, HashMap.class, String.class, Double.class);
        TreeMap treeMap5 = convArrToMap(arrayOfString, doubles, TreeMap.class, String.class, Double.class);
        LinkedHashMap linkedHashMap5 = convArrToMap(arrayOfString, doubles, LinkedHashMap.class, String.class, Double.class);
        //back
        ConvertFromMap.convMapToArr(hashMap5, String.class, Double.class);
        ConvertFromMap.convMapToArr(treeMap5, String.class, Double.class);
        ConvertFromMap.convMapToArr(linkedHashMap5, String.class, Double.class);

        //{int, class Car}
        HashMap hashMap6 = convArrToMap(integers, cars, HashMap.class, Integer.class, Object.class);
        TreeMap treeMap6 = convArrToMap(integers, cars, TreeMap.class, Integer.class, Object.class);
        LinkedHashMap linkedHashMap6 = convArrToMap(integers, cars, LinkedHashMap.class, Integer.class, Object.class);
        //back
        ConvertFromMap.convMapToArr(hashMap6, Integer.class, Object.class);
        ConvertFromMap.convMapToArr(treeMap6, Integer.class, Object.class);
        ConvertFromMap.convMapToArr(linkedHashMap6, Integer.class, Object.class);

        //{String, class Car}
        HashMap hashMap7 = convArrToMap(arrayOfString, cars, HashMap.class, String.class, Object.class);
        TreeMap treeMap7 = convArrToMap(arrayOfString, cars, TreeMap.class, String.class, Object.class);
        LinkedHashMap linkedHashMap7 = convArrToMap(arrayOfString, cars, LinkedHashMap.class, String.class, Object.class);
        //back
        ConvertFromMap.convMapToArr(hashMap7, String.class, Object.class);
        ConvertFromMap.convMapToArr(treeMap7, String.class, Object.class);
        ConvertFromMap.convMapToArr(linkedHashMap7, String.class, Object.class);

    }
}
