import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "zhangsan");
        map.put("2", "lisi");
        map.put("3", "wangwu");

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ", "  + entry.getValue());
        }

        for (String key: map.keySet()) {
            System.out.println(key + ", " + map.get(key));
        }

        for (String value: map.values()) {
            System.out.println(value);
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> cur = iterator.next();
            System.out.println(cur.getKey() + ", " + cur.getValue());
        }

        int[] arr = new int[0];

        System.out.println(arr.length);

    }
}
