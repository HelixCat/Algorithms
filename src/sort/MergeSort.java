package sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public List<Integer> mergeSorted(List<Integer> unsortedNumbers) {

        if (unsortedNumbers.size() <= 1) {
            return unsortedNumbers;
        }

        int middle = unsortedNumbers.size() / 2;

        List<Integer> leftNumbers = new ArrayList<>(unsortedNumbers.subList(0, middle));
        List<Integer> rightNumbers = new ArrayList<>(unsortedNumbers.subList(middle, unsortedNumbers.size()));

        leftNumbers = mergeSorted(leftNumbers);
        rightNumbers = mergeSorted(rightNumbers);

        return merge(leftNumbers, rightNumbers);
    }

    private List<Integer> merge(List<Integer> leftNumbers, List<Integer> rightNumbers) {

        List<Integer> merged = new ArrayList<>();
        int i = 0 , j = 0;

        while (i < leftNumbers.size() && j < rightNumbers.size()) {
            if (leftNumbers.get(i) <= rightNumbers.get(j)) {
                merged.add(leftNumbers.get(i));
                i++;
            } else {
                merged.add(rightNumbers.get(j));
                j++;
            }
        }

        while (i < leftNumbers.size()) {
            merged.add(leftNumbers.get(i));
            i++;
        }

        while (j < rightNumbers.size()) {
            merged.add(rightNumbers.get(j));
            j++;
        }

        return merged;
    }
}
