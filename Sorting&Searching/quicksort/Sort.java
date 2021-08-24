package quicksort;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    static List<Integer> quicksort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        List<Integer> lessThanPivot = new ArrayList<>();
        List<Integer> greaterThanPivot = new ArrayList<>();
        int pivot = list.get(0);
        int length = list.size();
        for (int i = 1; i < length; i++) {
            int currentValue = list.get(i);
            if (currentValue <= pivot) {
                lessThanPivot.add(currentValue);
            } else {
                greaterThanPivot.add(currentValue);
            }
        }
        List<Integer> sortedList = new ArrayList<>(quicksort(lessThanPivot));
        sortedList.add(pivot);
        sortedList.addAll(quicksort(greaterThanPivot));
        return sortedList;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(32, 100, 1, 2, 29, 28, 88, 3, 50, 67, 37, 1, 57, 20);
        System.out.println(quicksort(list));
    }
}