package strings;

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
            HashMap<Integer, Character> seenChars = new HashMap<>();
            int currentLength = 0;
            for(int p2 = p1; p2 < str.length(); p2++){
                var currentChar = str.charAt(p2);
                if(!seenChars.containsValue(currentChar)){
                currentLength++;
                seenChars.put(p2, currentChar);
                maxLength = Math.max(currentLength, maxLength);
                }else{
                    break;
                }
            }
        }
        return maxLength;
    }
}
