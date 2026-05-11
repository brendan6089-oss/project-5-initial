package com.example.sorting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SortingUtilityTest {
    // checks if array is sorted, reuse across tests
    private <T extends Comparable<T>> boolean isSorted(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].compareTo(a[i + 1]) > 0) return false;
        }
        return true;
    }

    // --- Gnome Sort Tests ---

    @Test
    void gnomeSort_emptyArray_noException() {
        Integer[] a = {};
        SortingUtility.gnomeSort(a);
        assertEquals(0, a.length);
    }

    @Test
    void gnomeSort_singleElement_unchanged() {
        Integer[] a = {5};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{5}, a);
    }

    @Test
    void gnomeSort_alreadySorted() {
        Integer[] a = {1, 2, 3, 4, 5};
        SortingUtility.gnomeSort(a);
        assertTrue(isSorted(a));
    }

    @Test
    void gnomeSort_reverseSorted() {
        Integer[] a = {5, 4, 3, 2, 1};
        SortingUtility.gnomeSort(a);
        assertTrue(isSorted(a));
    }

    @Test
    void gnomeSort_withDuplicates() {
        Integer[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.gnomeSort(a);
        assertTrue(isSorted(a));
    }

    @Test
    void gnomeSort_allSameElements() {
        Integer[] a = {5, 5, 5, 5, 5};
        SortingUtility.gnomeSort(a);
        assertTrue(isSorted(a));
    }

    @Test
    void gnomeSort_twoElementsSwapped() {
        Integer[] a = {2, 1};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void gnomeSort_twoElementsSorted() {
        Integer[] a = {1, 2};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void gnomeSort_randomOrder() {
        Integer[] a = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.gnomeSort(a);
        assertTrue(isSorted(a));
    }

    @Test
    void gnomeSort_stringArray() {
        String[] a = {"zebra", "apple", "mango", "banana"};
        SortingUtility.gnomeSort(a);
        assertTrue(isSorted(a));
    }

    // --- Cocktail Shaker Sort Tests ---

    @Test
    void cocktailShakerSort_emptyArray_noException() {
        Integer[] a = {};
        SortingUtility.cocktailShakerSort(a);
        assertEquals(0, a.length);
    }

    @Test
    void cocktailShakerSort_singleElement_unchanged() {
        Integer[] a = {5};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{5}, a);
    }

    @Test
    void cocktailShakerSort_alreadySorted() {
        Integer[] a = {1, 2, 3, 4, 5};
        SortingUtility.cocktailShakerSort(a);
        assertTrue(isSorted(a));
    }

    @Test
    void cocktailShakerSort_reverseSorted() {
        Integer[] a = {5, 4, 3, 2, 1};
        SortingUtility.cocktailShakerSort(a);
        assertTrue(isSorted(a));
    }

    @Test
    void cocktailShakerSort_withDuplicates() {
        Integer[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.cocktailShakerSort(a);
        assertTrue(isSorted(a));
    }

    @Test
    void cocktailShakerSort_allSameElements() {
        Integer[] a = {5, 5, 5, 5, 5};
        SortingUtility.cocktailShakerSort(a);
        assertTrue(isSorted(a));
    }

    @Test
    void cocktailShakerSort_twoElementsSwapped() {
        Integer[] a = {2, 1};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void cocktailShakerSort_twoElementsSorted() {
        Integer[] a = {1, 2};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void cocktailShakerSort_randomOrder() {
        Integer[] a = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.cocktailShakerSort(a);
        assertTrue(isSorted(a));
    }

    @Test
    void cocktailShakerSort_stringArray() {
        String[] a = {"zebra", "apple", "mango", "banana"};
        SortingUtility.cocktailShakerSort(a);
        assertTrue(isSorted(a));
    }

}
