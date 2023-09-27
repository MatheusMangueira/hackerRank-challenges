package challenges;

import java.util.List;

public class diagnalDifference {
  public static void main(String[] args) {

    diagonalDifference(List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(9, 8, 9)));

  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int left = 0;
    int right = 0;


    for (int i = 0; i < arr.size(); i++) {
      left = left + arr.get(i).get(i);
      System.out.println(left);
    }

    for (int i = 0; i < arr.size(); i++) {

      for (int j = arr.size() - 1; j >= 0; j--) {
        right = right + arr.get(i).get(j);
        i++;
      }
    }

    return Math.abs(left - right);
  }
}
