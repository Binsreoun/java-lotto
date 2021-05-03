package StringCalculator;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {
   public int add(final String text){
       String newText = isEmptyText(text);
       List<String> splittedText = splitText(newText);
       int result = 0;

       for(String number: splittedText) {
            result += Integer.parseInt(number);
       }

       return result;
   }

   public List<String> splitText(final String text) {
       String[] partOfText = text.split(",|:");
       return Arrays.asList(partOfText);
   }

   public String isEmptyText(final String text) {
       if(text == null || text.length() == 0) {
           return "0";
       }
       return text;
   }
}
