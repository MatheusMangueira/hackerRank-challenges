package challenges.staircase;

public class Staircase {
  public static void main(String[] args) {

    staircase(6);
  }

  public static void staircase(int n) {
    // Write your code here

    int[][] matriz = new int[n][n];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (j < matriz[i].length - 1 - i) {
          System.out.print(" ");
        } else {
          System.out.print("#");
        }
      }
      System.out.println();
    }

  }
}
