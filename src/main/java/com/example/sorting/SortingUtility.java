package com.example.sorting;


public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] a) {
       //gnome sort. moves forward when in order. swaps and steps back when not.
            int pos = 0;
            while (pos < a.length) {
                if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                    pos++; // in order, keep moving
                } else {
                    swap(a, pos, pos - 1); // out of order, swap and step back
                    pos--;
                }
            }
        }



    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {
        //cocktail shaker sort. similar bubble sort but goes both directions.
            boolean swapped;
            do {
                // forward pass
                swapped = false;
                for (int i = 0; i <= a.length - 2; i++) {
                    if (a[i].compareTo(a[i + 1]) > 0) {
                        swap(a, i, i + 1);
                        swapped = true;
                    }
                }
                if (!swapped) break;

                // backward pass
                swapped = false;
                for (int i = a.length - 2; i >= 0; i--) {
                    if (a[i].compareTo(a[i + 1]) > 0) {
                        swap(a, i, i + 1);
                        swapped = true;
                    }
                }
            } while (swapped);
        }



    public static <T extends Comparable<T>> void shellSort(T[] a) {
       //shell sort.insertion sort but with gaps that shrink down to 1
            int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1}; // Ciura gap sequence
            int n = a.length;

            for (int gap : gaps) {
                for (int i = gap; i < n; i += 1) {
                    T temp = a[i]; // save current element
                    int j;
                    // shift elements over until we find the right spot
                    for (j = i; j >= gap && a[j - gap].compareTo(temp) > 0; j -= gap) {
                        a[j] = a[j - gap];
                    }
                    a[j] = temp; // drop temp in correct spot
                }
            }
        }



    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }

}




