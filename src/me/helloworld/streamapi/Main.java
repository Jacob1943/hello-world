package me.helloworld.streamapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Jacob
 * @date 2019/9/27
 */
public class Main {
    public static void main(String[] args) {

        PurchaseRecord[] records = new PurchaseRecord[] {
                new PurchaseRecord(1, 1, 100, 1),
                new PurchaseRecord(2, 3, 1000,2),
                new PurchaseRecord(3, 3, 200,2),
                new PurchaseRecord(4, 3, 500,1),
                new PurchaseRecord(5, 2, 10000,2),
                new PurchaseRecord(6, 1, 700,1),
                new PurchaseRecord(7, 2, 900,2),
                new PurchaseRecord(8, 2, 2000,1),
                new PurchaseRecord(9, 1, 8800,2)
        };

        Map<Integer, Double> rate = new HashMap<Integer, Double>() {{
            put(1, 0.8);
            put(2, 0.9);
        }};

        Map<Integer, Double> res = Arrays.stream(records).map(r -> {
            r.setAmount(r.getAmount() * rate.get(r.getType()));
            return r;
        }).collect(Collectors.groupingBy(PurchaseRecord::getConsumerId,
                Collectors.summingDouble(PurchaseRecord::getAmount)));

        System.out.println(res);
    }
}
