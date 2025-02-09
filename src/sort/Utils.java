package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {

    public static void launcher(String algorithms) {
        List<Integer> numbers = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 1_00; i++) {
            int randomNumber = rand.nextInt(10_000) + 1;
            numbers.add(randomNumber);
        }

        List<Integer> sortedNumbers = new ArrayList<>();

        switch (algorithms) {
            case "insertion":
                InsertionSort insertionSort = new InsertionSort();
                sortedNumbers = insertionSort.sort(numbers);
                break;
            case "merge":
                MergeSort mergeSort = new MergeSort();
                sortedNumbers = mergeSort.mergeSorted(numbers);
                break;
        }

        printResult(sortedNumbers);


        System.out.println("finished..................................");
    }

    public static void printResult(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print("index " + i + " ( " + numbers.get(i) + ") ");
            if (i != 0 && i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n*********************************************");
    }
}
