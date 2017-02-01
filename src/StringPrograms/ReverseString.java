package StringPrograms;

/**
 * Created by nainadhanwani on 1/31/17.
 */
public class ReverseString {
    public String inputString;

 public static  String reverseString(String reverse)
 {
     String rev = "";
     int stringLength=reverse.length();
     for(int i=stringLength -1 ; i >= 0 ; i--)
     {
          rev += String.valueOf(reverse.charAt(i));

     }
     return rev;
 }

    public static void main(String[] args) {
        String reversed = reverseString("Hello to the new world");
        System.out.println(reversed);


    }
}
