package BubbleSorter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Collections;

import static main.Main.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {
    @Test
    public void testBubbleSortAsc() {
        System.out.println("Тест testBubbleSortAsc начат!");
        generateArray();
        ArrayList<Integer> copyOfGeneratedArray = new ArrayList<>(arrayToSort);
        bubbleSort(arrayToSort, true);
        Collections.sort(copyOfGeneratedArray);
        assertEquals(copyOfGeneratedArray, arrayToSort);
        System.out.println("Тест testBubbleSortAsc завершён успешно!");
    }
    @Test
    public void testBubbleSortDesc() {
        System.out.println("Тест testBubbleSortDesc начат!");
        generateArray();
        ArrayList<Integer> copyOfGeneratedArray = new ArrayList<>(arrayToSort);
        bubbleSort(arrayToSort, false);
        Collections.sort(copyOfGeneratedArray);
        copyOfGeneratedArray.sort(Collections.reverseOrder());
        assertEquals(copyOfGeneratedArray, arrayToSort);
        System.out.println("Тест testBubbleSortDesc завершён успешно!");
    }
}
