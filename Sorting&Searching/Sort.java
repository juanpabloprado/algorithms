import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
    static List<Integer> selectionSort(List<Integer> list) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        int length = list.size();
        for (int i = 0; i < length; i++) {
            int indexToMove = indexOfMin(list);
            int min = list.remove(indexToMove);
            sortedList.add(min);
        }
        return sortedList;
    }

    static int indexOfMin(List<Integer> list) {
        int minIndex = 0;
        int length = list.size();
        for (int i = 0; i < length; i++) {
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(29, 100, 1, 2, 57));
        System.out.println(selectionSort(list));
    }
}