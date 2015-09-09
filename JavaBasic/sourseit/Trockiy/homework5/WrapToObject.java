package sourseit.homeworks.homework5;

public class WrapToObject {

    public Integer[] IntWrap (int[] array) {

        Integer[] integers = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
        integers[i] = array[i];
        }
        return integers;
    }

    public Double[] DoubleWrap (double[] array) {

        Double[] doubles = new Double[array.length];

        for (int i = 0; i < array.length; i++) {
            doubles[i] = array[i];
        }
        return doubles;
    }

    public Boolean[] BooleanWrap (boolean[] array) {

        Boolean[] booleans = new Boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            booleans[i] = array[i];
        }
        return booleans;
    }

    public Long[] LongWrap (long[] array) {

        Long[] longs = new Long[array.length];

        for (int i = 0; i < array.length; i++) {
            longs[i] = array[i];
        }
        return longs;
    }
}
