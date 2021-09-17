import java.util.*;
import java.util.regex.*;
/*
    Secret Code
*/
class LargestSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(findLargest(str));
        input.close();
    }

    public static String findLargest(String str) {
        int length = 0;
        // int y = 0;
        // int x = 0;
        String match = "";

        for(int y = 0; y < str.length(); y++) {
            for(int x = y+1; x < str.length(); x++) {
                String substring = str.substring(y, x);
                Pattern myPattern = Pattern.compile(substring);
                Matcher myMatcher = myPattern.matcher(str);
                ArrayList<String> list = new ArrayList<>();
                while(myMatcher.find()) {
                    list.add(myMatcher.group());
                }

                if(list.size() > 1 && substring.length() > length) {
                    match = substring;
                    length = substring.length();
                } 
            }
        }

        if(match != "") return match;
        else return "I'm fine!";
    }
   
}