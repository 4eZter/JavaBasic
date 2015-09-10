package sourseit.homeworks.homework5.third;

import java.util.Map;

public class ConvertToMap {

    @SuppressWarnings("unchecked")
    public static <T, K1, V2> T convArrToMap (Object[] input1, Object[] input2, Class<T> mapType, Class<K1> key, Class<V2> value)
            throws IllegalAccessException, InstantiationException {

        Map<K1, V2> map = (Map<K1, V2>) mapType.newInstance();

        System.out.println(key + " and " + value + " convert to " + mapType);
        int count = 0;

        while (count < input1.length && count < input2.length ) {
            map.put((K1) input1[count], (V2) input2[count]);
            count++;
        }


        for (Object s : map.keySet()) {
            System.out.println(s + " " + map.get(s));
        }

        System.out.println("\n");
        return (T) map;

    }
}

