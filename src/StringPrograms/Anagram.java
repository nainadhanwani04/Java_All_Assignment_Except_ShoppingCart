package StringPrograms;

/**
 * Created by nainadhanwani on 1/31/17.
 */
public class Anagram{

    public static Boolean isAnagram(String firstString, String secondString) {
        String first = firstString;
        String second = secondString;
        int flag = 0;
        if ( first.length() != second.length() ) {
            return false;
        } else {
            for (int i = 0; i < first.length(); i++) {
                char checkFirst = first.charAt(i);
                for (int j = 0; j < second.length(); j++) {
                    if ( checkFirst == second.charAt(j) ) {
                        flag++;
                    }
                }
                    if ( flag == 0 )
                        break;

                      flag = 0;
            }


        }
                if ( flag == 0 )
                    return false;
                else
                    return true;


    }

    public static void main(String[] args) {

        Boolean checkStrings = isAnagram("hello","hillo");
        System.out.println(checkStrings);
    }
}