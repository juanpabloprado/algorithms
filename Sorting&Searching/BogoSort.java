import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BogoSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(29, 100, 1, 2, 57));
        bogoSort(list);
        System.out.println(list);
    }

    static void bogoSort(List<Integer> list) {
        while (!isSorted(list)) {
            Collections.shuffle(list);
        }
    }

    static boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}