package challenges.miniMaxSum;

import java.util.List;

public class MiniMaxSum {
  public static void main(String[] args) {
    miniMaxSum(List.of(7, 69, 2, 221, 8974));
  }

  public static void miniMaxSum(List<Integer> arr) {

    long sum = arr.get(0);
    int min = arr.get(0);
    int max = arr.get(0);

    for (int i = 1; i < arr.size(); i++) {
      sum += arr.get(i);

      if (arr.get(i) < min) {
        min = arr.get(i);
      }

      if (arr.get(i) > max) {
        max = arr.get(i);

      }

    }

    System.out.println((sum - max) + " " + (sum - min));

  }

}
