package challenges.plusMinus;


import java.util.List;

public class plusMinus {
  public static void main(String[] args) {

    plusMinus(List.of(1, 1, 0, -1, -1));
  }

  public static void plusMinus(List<Integer> arr) {

    int lengthArr = arr.size();
    double positive = 0;
    double negative = 0;
    double zero = 0;


    for (int i = 0; i < arr.size(); i++) {

      if (arr.get(i) > 0) {
        positive++;
      } else if (arr.get(i) < 0) {
        negative++;
      } else {
        zero++;
      }
    }

    System.out.println(String.format("%.6f", positive / lengthArr));
    System.out.println(String.format("%.6f", negative / lengthArr));
    System.out.println(String.format("%.6f", zero / lengthArr));


  }

}




