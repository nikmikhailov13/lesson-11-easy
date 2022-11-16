package org.example;

public class SortUtils {

  public int[] swap(int[] array, int index1, int index2) {

    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;

    return array;
  }

  public int[] selectSort(int[] array) {

    int minIndex;

    for (int i = 0; i < array.length; i++) {
      minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[minIndex] > array[j]) {
          minIndex = j;
        }
      }
      swap(array, minIndex, i);
    }
    return array;
  }

}
