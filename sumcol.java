import java.io.*;
import java.util.*;
import java.text.*;

public class sumcol {
   public static void main(String[] args) {
      int sum = 0;
      String line;
      try {
         BufferedReader in1 = new BufferedReader(new InputStreamReader(System.in));
         while ((line = in1.readLine()) != null) {
            sum = sum + Integer.parseInt(line);
         }
      } catch (IOException e) {
         System.err.println(e);
         return;
      }
      System.out.println(Integer.toString(sum));
   }
}
//Hello world how are you?
//hey all