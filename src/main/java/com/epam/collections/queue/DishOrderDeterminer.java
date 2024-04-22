package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            linkedList.add(i);
        }

        while (!linkedList.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++) {
                linkedList.add(linkedList.poll());
            }
            list.add(linkedList.poll());
        }

        return list;
    }
}
