package sourseit.homeworks.homework5.third;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ConvertFromMap {

    @SuppressWarnings("unchecked")
    public static <T extends Map, K1, V2> void convMapToArr (T map, Class<K1> key, Class<V2> value){

        Object[] array = new Object[map.size()];
        Object[] array1 = new Object[map.size()];

        Set set = map.keySet();
        Iterator itr = set.iterator();

        int count = 0;
        while (itr.hasNext()) {
            array[count] = (K1) itr.next();
            count++;
        }

        int i = 0;
        for (Object e : map.keySet()) {
            array1[i] = (V2) map.get(e);
            i++;
        }

        System.out.println(map.getClass() + " " + "Back operation");
        for (int count2 = 0; count2 < array.length; count2++){
            System.out.println(array[count2] + " " + array1[count2]);
        }

        System.out.println("\n");

    }
}
