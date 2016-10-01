package helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapPrinter {

    public static void pintMap(Map map) {
        List<String > keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(map.values());

        for (int i = 0; i < keys.size(); i++) {
            System.out.println(prepareStringToPrint(keys, values, i));
        }

    }

    private static String prepareStringToPrint(List<String> keys, List<Integer> values, int index) {
        return keys.get(index) + " -> " + values.get(index);
    }
}
