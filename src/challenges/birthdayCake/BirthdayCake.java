package challenges.birthdayCake;

import java.util.List;

public class BirthdayCake {

   public static void main(String[] args) {

      birthdayCakeCandles(List.of(3, 2, 1, 3));

   }

   public static int birthdayCakeCandles(List<Integer> candles) {
      int max = 0;
      int cout = 0;

      for (int i = 0; i < candles.size(); i++) {

         if (candles.get(i) > max) {
            max = candles.get(i);
         }

      }

      for (int i = 0; i < candles.size(); i++) {

         if (candles.get(i) == max) {
            cout++;
         }

      }

      return cout;
   }

}
