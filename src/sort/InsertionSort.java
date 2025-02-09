package sort;

import java.util.List;

public class InsertionSort {

    public List<Integer> sort(List<Integer> unsortedList) {
        System.out.println(unsortedList.size());
        for (int i = 1; i < unsortedList.size(); i++) {
            Integer item = unsortedList.get(i);
            int j = i - 1;
            while (j >= 0 && unsortedList.get(j) > item) {
                unsortedList.set(j + 1, unsortedList.get(j));
                j = j - 1;
            }
            unsortedList.set(j + 1, item);
        }
        return unsortedList;
    }


}
