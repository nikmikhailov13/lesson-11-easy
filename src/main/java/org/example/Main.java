package org.example;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int[] arr = {8, -9, 0, 12, 9};
    SortUtils sortUtils = new SortUtils();
    SearchUtils searchUtils = new SearchUtils();

    System.out.println(Arrays.toString(arr));

    System.out.println(Arrays.toString(sortUtils.selectSort(arr)));

    System.out.println(searchUtils.linearSearch(arr, 11));

  }
}