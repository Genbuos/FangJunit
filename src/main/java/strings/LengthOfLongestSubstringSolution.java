package strings;

import java.util.ArrayList;
import java.util.HashMap;

public class LengthOfLongestSubstringSolution {
    public int solution(String str){
        int maxLength = 0;
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < str.length(); i ++){
//            var x = str.charAt(i);
//            int index = sb.indexOf(String.valueOf(x));
//            if(index != -1){
//                sb.delete(0, index + 1);
//            }
//            sb.append(x);
//            maxLength = Math.max(maxLength, sb.length());
//        }

        //Brute Force
        if(str.length() <= 1){
            return str.length();
        }

        for(int p1 =0; p1 < str.length(); p1++){
            ArrayList<Character> seenChars = new ArrayList<>();
            int currentLength = 0;
            for(int p2 = p1; p2 < str.length(); p2++){
                var currentChar = str.charAt(p2);
                if(!seenChars.contains(currentChar)){
                currentLength++;
                seenChars.add(currentChar);
                maxLength = Math.max(currentLength, maxLength);
                }else{
                    break;
                }
            }
        }
        return maxLength;
    }
}
