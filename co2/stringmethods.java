import java.lang.String;
 
public class stringmethods {
 
    public static void main(String[] args) {
         
        String str1 = "sebinxysebinxysebin";
        String str2 = "john";
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));
        System.out.println(str1.length());
         System.out.println(str1.charAt(1));
         System.out.println(str1.compareTo(str2));
         
         System.out.println(str1.toLowerCase());
         System.out.println(str1.toUpperCase());
         System.out.println(str1.startsWith("se"));
          System.out.println(str1.endsWith("hn"));
          String replace=str1.replace("xy","ab");
          System.out.println(replace);
          System.out.println(str1.contains("ab"));
          System.out.println(str1.equals(str2));
          System.out.println(str2.trim()+"sebin");
           System.out.println(str1.substring(2,9));
         

    }
}